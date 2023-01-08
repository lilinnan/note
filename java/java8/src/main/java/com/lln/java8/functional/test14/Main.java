package com.lln.java8.functional.test14;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Test, String> function = Test::function;
        FunctionInterface1 function1 = Test::function1;
        FunctionInterface2 function2 = Test::function2;
        Test test = new Test(6);
        System.out.println(function.apply(test));
        Test test1 = new Test(8);
        System.out.println(function1.run(test1, "test1"));
        Test test2 = new Test(10);
        System.out.println(function2.run(test2, "test2-1", "test2-2"));
    }

    @FunctionalInterface
    public interface FunctionInterface1 {
        String run(Test test, String arg);
    }

    @FunctionalInterface
    public interface FunctionInterface2 {
        String run(Test test, String arg1, String arg2);
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
