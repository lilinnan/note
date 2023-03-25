package com.lln.java9.test1;

public class Main {
    public static void main(String[] args) {
        OldInterface oldInterface = new OldInterface() {
            // 空实现
        };
        oldInterface.method();
        // 可以
        oldInterface.test();
        // 这样也行
        OldInterface.test1();
        // 我不想让外部调用啊，咋办？

        // Java9中引入接口的private方法
        NewInterface newInterface = new NewInterface() {
            // 空实现
        };
        newInterface.method();
        // 不行了，接口内限制了private，不可调用
        // newInterface.test();
        // NewInterface.test1();
    }
}
