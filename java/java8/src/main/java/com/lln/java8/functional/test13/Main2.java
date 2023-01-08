package com.lln.java8.functional.test13;

import com.lln.java8.functional.test4.Action;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main2 {
    public static void main(String[] args) {
        // 例如我们可以直接引用Collections的emptySet方法，返回一个空的set
        Supplier<Set<String>> emptyMap = Collections::emptySet;
        Set<String> emptySet = emptyMap.get();
        // 或者还可以直接引用这个类的main方法
        Consumer<String[]> main = Main2::main;
        // 不能调用，会溢出
        // main.accept(new String[]{});
    }
}
