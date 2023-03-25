package com.lln.java16.test2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", 123);
        Employee employee1 = new Employee("Tom", 124);
        // id的访问器
        System.out.println(employee.id());
        // name的访问器
        System.out.println(employee.name());
        // toString方法
        System.out.println(employee);
        // equals
        System.out.println(employee.equals(employee1));
        // hashCode
        var result = Map.of(employee, "A", employee1, "B");
        result.forEach((e, s) -> System.out.println(e + "--" + s));
    }
}
