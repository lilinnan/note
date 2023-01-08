package com.lln.java8.functional.test15;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Test test = new Test(6);
        // 这里supplier就可接收了
        Supplier<String> function = test::function;
        System.out.println(function.get());

        Test test1 = new Test(8);
        FunctionInterface1 function1 = test1::function1;
        System.out.println(function1.run("test1"));


        Test test2 = new Test(10);
        FunctionInterface2 function2 = test2::function2;
        System.out.println(function2.run("test2-1", "test2-2"));
    }

    @FunctionalInterface
    public interface FunctionInterface1 {
        String run(String arg);
    }

    @FunctionalInterface
    public interface FunctionInterface2 {
        String run(String arg1, String arg2);
    }

    public static class Test {

        private final int mMyNumber;

        public Test(int myNumber) {
            this.mMyNumber = myNumber;
        }

        public String function() {
            return String.valueOf(mMyNumber);
        }

        public String function1(String arg) {
            return mMyNumber + "--" + arg;
        }

        public String function2(String arg1, String arg2) {
            return mMyNumber + "--" + arg1 + "--" + arg2;
        }

    }
}
