package com.lln.java8.functional.test19;

import java.util.Objects;
import java.util.stream.Stream;

public class Main7 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        // 有任何一个满足
        System.out.println(stringStream.anyMatch(s -> s.length() == 5));

        stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        // 全部满足
        System.out.println(stringStream.allMatch(Objects::nonNull));

        stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        // 都不满足
        System.out.println(stringStream.noneMatch(s -> s.length() == 0));
    }
}
