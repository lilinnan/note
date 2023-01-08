package com.lln.java8.functional.test23;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            long l = System.currentTimeMillis();
            Stream.generate(Math::random)
                    .parallel()
                    .limit(10000000)
                    .sorted()
                    .reduce(Double::sum)
                    .ifPresent(System.out::println);
            System.out.println(System.currentTimeMillis() - l);
        }
    }
}
