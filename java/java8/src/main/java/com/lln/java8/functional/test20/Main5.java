package com.lln.java8.functional.test20;

import java.util.stream.Stream;

public class Main5 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("ccccc", "bbbb", "aaaa", "ddd");
        // 使用不传入比较器，对象需要实现Comparable接口，否则会报错
        stringStream.sorted().forEach(System.out::println);
        System.out.println();
        stringStream = Stream.of("ccccc", "bbbb", "aaaa", "ddd");
        // 传入比较器的自定义实现 将排序反转
        stringStream.sorted((o1, o2) -> -o1.compareTo(o2)).forEach(System.out::println);

    }
}
