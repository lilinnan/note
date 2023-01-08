package com.lln.java8.functional.test12;

import java.util.UUID;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // 生产者，我们创建一个生产者，用于生成uuid
        Supplier<String> uuidGenerator = () -> UUID.randomUUID().toString();
        for (int i = 0; i < 5; i++) {
            System.out.println(uuidGenerator.get());
        }
    }
}
