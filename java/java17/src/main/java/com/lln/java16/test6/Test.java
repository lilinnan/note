package com.lln.java16.test6;

public record Test(int x) {
    public Test {
        // 这里虽然看起来在修改x的值，但是但是编译器会为x创建一个中间占位符，并在构造器的最后执行一次赋值，并将结果赋值给this.x
        x += 10;
    }

    public static void main(String[] args) {
        Test test = new Test(5);
        System.out.println(test.x());
    }
}
