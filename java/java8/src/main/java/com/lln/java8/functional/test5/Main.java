package com.lln.java8.functional.test5;

public class Main {
    public static void main(String[] args) {
        /*Action1 action1 = new Action1() {
            @Override
            public void run(int a) {
                System.out.println(a);
            }
        };*/
        //这是完整的写法
        Action1 action1 = (int a) -> {
            System.out.println(a);
        };
        //参数类型其实可以直接去掉，因为Action1接口中
        //只有一个抽象方法，jvm会自动推断他是什么类型
        Action1 action2 = (a) -> {
            System.out.println(a);
        };
        //当只有一个参数的时候，可以直接去掉小括号
        Action1 action3 = a -> {
            System.out.println(a);
        };
        //因为就只有一行语句，花括号也可以去掉
        Action1 action4 = a -> System.out.println(a);

        //需要注意，如果有两个参数，小括号就不能省略了~
        Action2 action5 = (a, b) -> {
            System.out.println(a);
            System.out.println(b);
        };
    }
}
