package com.lln.java8.functional.test9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //测试list里面的每个数字是否都大于5
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Predicate<Integer> predicate = number -> number > 5;
        //测试list里面每个数字是不是都大于5
        System.out.println(test(list, predicate));
        //测试list里面每个数字是不是都小于等于5
        Predicate<Integer> negate = predicate.negate();
        System.out.println(test(list, negate));
        //测试list里面的每个数字是不是都既大于5 又小于等于5，明显不可能，只是个例子
        Predicate<Integer> and = predicate.and(negate);
        System.out.println(test(list, and));
        //测试list里面的每个数字是不是都大于5或者小于等于5
        Predicate<Integer> or = predicate.or(negate);
        System.out.println(test(list, or));

        //还有一个例子，在Collection集合中，有一个方法，default boolean removeIf(Predicate<? super E> filter)
        //可以移除满足条件的值，例如，移除大于5的值
        list.removeIf(predicate);
        System.out.println(list);

    }

    private static <T> boolean test(List<T> list, Predicate<T> predicate) {
        for (T t : list) {
            if (!predicate.test(t)) {
                return false;
            }
        }
        return true;
    }
}
