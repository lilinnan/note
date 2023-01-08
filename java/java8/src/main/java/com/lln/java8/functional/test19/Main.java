package com.lln.java8.functional.test19;

import java.util.Iterator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("a", "b", "c", "d");
        Iterator<String> iterator = stringStream.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
