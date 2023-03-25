package com.lln.java10.test1;

import java.util.List;

public class Main {
    String field1 = "hello";

    // 这样不行 因为字段上不支持
    // var field2 = "Hello";

    void test() {
        // 声明类型
        String str = "Hello";
        // 让编译器推断
        var str1 = "Hello";
        // 同时支持用户自定义的类型
        Main test = new Main();
        var test1 = new Main();
    }

    /**
     * 静态方法内也是可以的
     */
    static void test1() {
        // 声明类型
        String str = "Hello";
        // 让编译器推断
        var str1 = "Hello";
        // 同时支持用户自定义的类型
        Main test = new Main();
        var test1 = new Main();
    }


    // 方法参数也不可
    /*void test2(var param) {

    }*/

    // 返回值也不可
    /*var test3() {
    }*/

    void test4() {
        // 没初始化数据不行
        // var str;
        // 给个null也不行
        // var str1 = null;
    }

    void test5() {
        List<String> list = List.of("a", "b", "c", "d", "e", "f",
                "g", "h", "i", "j", "k");
        // 这个东西在foreach上非常好使
        for (var str : list) {
            System.out.println(str);
        }
    }
}
