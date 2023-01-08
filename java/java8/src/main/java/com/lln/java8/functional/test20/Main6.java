package com.lln.java8.functional.test20;

import java.util.stream.Stream;

public class Main6 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        // 只要前面n个元素
        stringStream.limit(3).forEach(System.out::println);
        System.out.println();
        stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        // 跳过前面n个元素
        stringStream.skip(3).forEach(System.out::println);
    }
}
