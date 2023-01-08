package com.lln.java8.functional.test18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("a", "b", "c", "d");
        // 转数组
        System.out.println("toArray");
        String[] array = stringStream.toArray(String[]::new);
        System.out.println(Arrays.toString(array) + "\n");


        // 转集合 set
        System.out.println("toSet");
        stringStream = Stream.of("a", "b", "c", "d");
        Set<String> stringSet = stringStream.collect(Collectors.toSet());
        stringSet.forEach(System.out::println);
        System.out.println();
        // 或
        //Set<String> stringHashSet = stringStream.collect(Collectors.toCollection(HashSet::new));


        // 转list
        System.out.println("toList");
        stringStream = Stream.of("a", "b", "c", "d");
        List<String> stringList = stringStream.collect(Collectors.toList());
        stringList.forEach(System.out::println);
        System.out.println();
        // 或
        // ArrayList<String> stringArrayList = stringStream.collect(Collectors.toCollection(ArrayList::new));

        // 可以将流里面的东西连接起来转成string
        stringStream = Stream.of("a", "b", "c", "d");
        System.out.println(stringStream.collect(Collectors.joining()));
        stringStream = Stream.of("a", "b", "c", "d");
        System.out.println(stringStream.collect(Collectors.joining("-")));
        stringStream = Stream.of("a", "b", "c", "d");
        System.out.println(stringStream.collect(Collectors.joining("-", "start:", ":end")));


    }
}
