package com.lln.java8.functional.test19;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("groupByLength");
        Stream<String> stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        // 按照长度分组
        Map<Integer, List<String>> groupByLength = stringStream.collect(Collectors.groupingBy(String::length));
        groupByLength.forEach((key, result) -> System.out.println(key + "--" + String.join(",", result)));
        System.out.println();

        System.out.println("partitionByLength");
        stringStream = Stream.of("aaaa", "bbbb", "ccccc", "ddd");
        // 按照长度分区
        Map<Boolean, List<String>> partitionByLength = stringStream.collect(Collectors.partitioningBy(s -> s.length() == 4));
        partitionByLength.forEach((key, result) -> System.out.println(key + "--" + String.join(",", result)));


    }
}
