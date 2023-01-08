package com.lln.java8.functional.test10;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Test test = new Test("Hello");
        //对str进行反转
        Consumer<Test> consumer1 = t -> {
            StringBuilder stringBuilder = new StringBuilder(test.str);
            test.str = stringBuilder.reverse().toString();
        };
        //对str进行大写
        Consumer<Test> consumer2 = t -> t.str = t.str.toUpperCase();

        //对str先进行反转，然后再全大写
        Consumer<Test> consumer3 = consumer1.andThen(consumer2);

        consumer1.accept(test);
        System.out.println(test.str);


        test.str = "Hello";
        consumer2.accept(test);
        System.out.println(test.str);


        test.str = "Hello";
        consumer3.accept(test);
        System.out.println(test.str);

    }


    private static class Test {
        String str;

        public Test(String str) {
            this.str = str;
        }
    }
}
