package com.lln.java8.functional.test18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        // 直接使用Stream#of方法
        System.out.println("stream of");
        Stream<String> stringStream = Stream.of("a", "b", "c", "d");
        stringStream.forEach(System.out::println);
        System.out.println("\n");

        // 数组转stream，使用Arrays.stream方法
        System.out.println("Arrays.stream");
        String[] arr = {"a", "b", "c", "d"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
        System.out.println("\n");

        // 集合转stream 使用Collection#stream方法
        System.out.println("Collection#stream");
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", "b", "c", "d");
        Stream<String> stringStream1 = strings.stream();
        stringStream1.forEach(System.out::println);
        System.out.println("\n");

        // 0,1,2
        System.out.println("range");
        IntStream intStream = IntStream.range(0, 3);
        intStream.forEach(System.out::println);
        System.out.println("\n");

        // 0,1,2,3
        System.out.println("rangeClosed");
        IntStream intStream1 = IntStream.rangeClosed(0, 3);
        intStream1.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("of");
        IntStream intStream2 = IntStream.of(1, 2, 3, 4, 5);
        intStream2.forEach(System.out::println);
        System.out.println("\n");
    }
}
