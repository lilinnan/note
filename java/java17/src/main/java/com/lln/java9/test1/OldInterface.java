package com.lln.java9.test1;

public interface OldInterface {
    default void test() {
        System.out.println("test()...");
    }

    static void test1() {
        System.out.println("test1()...");
    }

    default void method() {
        // 这里调用test()与test1()来实现我们期望的逻辑默认逻辑
        test();
        test1();
    }


}
