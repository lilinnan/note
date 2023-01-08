package com.lln.java8.functional.test21;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream1 = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        Stream<String> stringStream2 = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        // 拼接两个流
        Stream<String> stream = Stream.concat(stringStream1, stringStream2);
        stream.forEach(System.out::println);

    }
}
