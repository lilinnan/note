package com.lln.java8.functional.test11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String str = "a-b-c-d-e-f-g-a-b-c";
        // 定义第一个方法，可以将字符串通过-分割，并返回一个数组
        Function<String, String[]> function1 = s -> s.split("-");
        // 定义第二个方法，可以将一个字符串数组转换为一个list
        Function<String[], Set<String>> function2 = arr -> {
            HashSet<String> set = new HashSet<>();
            Collections.addAll(set, arr);
            return set;
        };
        // 第三个方法是通过第一个和第二个组合而成的，使用了andThen方法
        Function<String, Set<String>> function3 = function1.andThen(function2);

        // 调用第三个方法
        Set<String> result = function3.apply(str);
        result.forEach(s -> System.out.println(s));
    }
}
