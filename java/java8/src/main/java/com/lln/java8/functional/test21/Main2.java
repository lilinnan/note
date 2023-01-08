package com.lln.java8.functional.test21;

import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        // 生成100个随机数
        Stream.generate(Math::random)
                .limit(100)
                .forEach(System.out::println);
    }
}
