package com.lln.java8.functional.test6;

public class Main {
    public static void main(String[] args) {
        /*Action action = new Action() {
            @Override
            public int run(int a, int b) {
                return a + b;
            }
        };*/

        //和写普通方法其实没什么区别，直接写return即可
        Action action1 = (a, b) -> {
            return a + b;
        };
        //但是如果方法中只有一个语句，可以直接省略return
        //刚刚还提到，如果只有一行语句，花括号也可以省略
        Action action2 = ((a, b) -> a + b);
        //多行语句则必须写return
        Action action3 = (a, b) -> {
            System.out.println(a);
            System.out.println(b);
            return a + b;
        };

    }
}
