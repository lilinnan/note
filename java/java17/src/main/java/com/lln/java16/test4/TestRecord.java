package com.lln.java16.test4;

public record TestRecord(int test) implements TestInterface {

    // 我们这里实际上没有写test方法的实现，但是我们有一个test的字段，这个字段的访问器实现了test方法
    @Override
    public void test1() {
    }

    @Override
    public void test2() {

    }
}
