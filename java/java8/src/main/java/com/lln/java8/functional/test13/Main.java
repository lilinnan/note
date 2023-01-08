package com.lln.java8.functional.test13;

public class Main {

    public static void main(String[] args) {
        // Runnable接口的函数，也是无参无返回值的函数，和Test的function方法的三要素是相同的
        // 所以我们可以直接引用Test::function
        Runnable runnable = Test::function;
        runnable.run();
    }

    static class Test {
        /**
         * 无参无返回值的函数
         */
        static void function() {
            System.out.println("Test#function");
        }
    }
}
