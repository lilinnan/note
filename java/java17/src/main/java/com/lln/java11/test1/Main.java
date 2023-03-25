package com.lln.java11.test1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "111", 2, "222", 3, "333");
        // 支持为参数添加类型，但是这个要写就都得写var，要不写就都别写
        map.forEach((var integer, var s) -> System.out.println(integer + "--" + s));
        // 这样不行，s没写，报错
        // map.forEach((var integer, s) -> System.out.println(integer + "--" + s));
        // 这也不行，混合也不行
        // map.forEach((var integer, String s) -> System.out.println(integer + "--" + s));
    }
}
