package com.lln.java8.functional.test10;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        //在Java8中为Iterable接口中添加了一个默认方法，forEach，通过接受一个Consumer来及进行遍历
        List<String> students = Arrays.asList("ZhangSan", "LiSi", "WangWu");
        students.forEach(s -> System.out.println(s));
    }
}
