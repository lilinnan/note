package com.lln.java8.functional.test20;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        stringStream.filter(s -> s.length() == 5)
                .forEach(System.out::println);
    }
}
