package com.lln.java8.functional.test19;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main8 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        stringStream.sorted(Comparator.comparingInt(String::length))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
