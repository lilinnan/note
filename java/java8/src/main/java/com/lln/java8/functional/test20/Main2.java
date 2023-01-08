package com.lln.java8.functional.test20;

import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        // 将流中的元素映射到新的类型上
        Stream<Integer> integerStream = stringStream.map(String::length);
        integerStream.forEach(System.out::println);
    }
}
