package com.lln.java16.test7;

public record Test(int x) {

    public Test(int x) {
        // 这里必须初始化，否则会报错
        this.x = x;
    }
}
