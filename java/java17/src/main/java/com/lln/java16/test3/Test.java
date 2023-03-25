package com.lln.java16.test3;

public record Test(int a, int b) {
    void test1() {
        // 创建方法，只可以读取字段
        System.out.println(a);
        System.out.println(b);
    }

    void test2() {
        // 这样是非法的，因为字段不可以修改，隐式的final
        // a = 5;
        // b = 6;
    }
}
