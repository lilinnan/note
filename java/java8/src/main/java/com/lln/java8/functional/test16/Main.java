package com.lln.java8.functional.test16;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // 会引用无参数的构造方法
        Supplier<Test> constructor = Test::new;
        Test test = constructor.get();
        System.out.println(test.getMyNumber());

        // 引用一个参数的构造方法
        Function<Integer, Test> constructor1 = Test::new;
        Test test1 = constructor1.apply(5);
        System.out.println(test1.getMyNumber());

        // 引用两个参数的构造方法
        BiFunction<Integer, Integer, Test> constructor2 = Test::new;
        Test test2 = constructor2.apply(5, 8);
        System.out.println(test2.getMyNumber());

        // 引用数组的构造方法
        FunctionInterface arrayConstructor = int[]::new;
        int[] array = arrayConstructor.run(5);
        System.out.println(array.length);
    }

    private interface FunctionInterface {
        int[] run(int length);
    }

    private static class Test {
        private final int mMyNumber;

        public Test() {
            this.mMyNumber = 0;
        }

        public Test(int number) {
            this.mMyNumber = number;
        }

        public Test(int number1, int number2) {
            this.mMyNumber = number1 + number2;
        }

        public int getMyNumber() {
            return mMyNumber;
        }
    }
}
