package com.lln.java9.test1;

public interface NewInterface {
    private void test() {
        System.out.println("test()...");
    }

    private static void test1() {
        System.out.println("test1()...");
    }

    default void method() {
        test();
        test1();
    }

}
