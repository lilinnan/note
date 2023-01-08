package com.lln.java8.functional.test20;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        stringStream.flatMap(s -> Arrays.stream(s.split("")))
                .forEach(System.out::println);

    }
}
