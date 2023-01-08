package com.lln.java8.functional.test11;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "111");
        map.put("2", "222");
        map.computeIfAbsent("3", s -> s + s + s);
        map.forEach((s, s2) -> {
            System.out.println(s + "---" + s2);
        });
    }
}
