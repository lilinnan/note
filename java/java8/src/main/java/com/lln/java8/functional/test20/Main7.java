package com.lln.java8.functional.test20;

import java.util.stream.Stream;

public class Main7 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("aaaa", "bbbb", "aaaa", "ddd");
        stringStream.distinct().forEach(System.out::println);
    }
}
