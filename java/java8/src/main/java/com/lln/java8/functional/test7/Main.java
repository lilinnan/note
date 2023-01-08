package com.lln.java8.functional.test7;

public class Main {
    public static void main(String[] args) {
        test1(() -> {
        });
        test2(() -> {
        });
    }

    private static void test1(Test1 test1) {

    }

    private static void test2(Test2 test2) {

    }
}

interface Test1 {
    void test();
}

interface Test2 {
    void test();
}
