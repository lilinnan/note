package com.lln.java8.functional.test19;

import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("a", "b", "c", "d");
        System.out.println(stringStream.count());
    }
}
