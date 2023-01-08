package com.lln.java8.functional.test19;

import java.util.stream.Stream;

public class Main5 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("a", "b", "c", "d");
        stringStream.min(String::compareTo).ifPresent(System.out::println);
    }
}
