package com.lln.java8.functional.test8;

public class Main {
    public static void main(String[] args) {
        test((Test1) () -> {
        });
        test((Test2) () -> {
        });
    }

    private static void test(Test1 test1) {

    }

    private static void test(Test2 test2) {

    }
}

interface Test1 {
    void test();
}

interface Test2 {
    void test();
}
