package com.lln.java8.functional.test20;

import java.util.stream.Stream;

public class Main4 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        // 不传入起始值
        stringStream.reduce((s, s2) -> s + s2).ifPresent(System.out::println);

        stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        // 传入起始值
        System.out.println(stringStream.reduce("-----", (s, s2) -> s + s2));
    }
}
