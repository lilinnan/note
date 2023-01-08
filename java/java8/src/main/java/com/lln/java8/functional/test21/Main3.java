package com.lln.java8.functional.test21;

import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        // 从1开始，每次+3，并输出
        Stream.iterate(1, i -> i + 3)
                .limit(10)
                .forEach(System.out::println);
    }
}
