package com.lln.java8.functional.test4;

public class Main {
    public static void main(String[] args) {
        /*Action action1 = new Action() {
            @Override
            public void run() {

            }
        };*/
        //如果是空实现，就这样写，没有任何内容，但是基本格式必须要有()->{}
        Action action1 = () -> {
        };

        /*Action action2 = new Action() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        }*/
        //如果只有一行语句，那么大括号可以省略~
        Action action2 = () -> System.out.println("Hello World");


        /*Action action3 = new Action() {
            @Override
            public void run() {
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
            }
        };*/
        //但是如果有多行语句，大括号务必写上，因为需要告诉编译器，这个lambda表达式到哪结束
        Action action3 = () -> {
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
        };
    }
}