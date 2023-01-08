package com.lln.java8.functional.test17;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // 创建一个optional
        Optional<Test> optional = Optional.of(new Test((int) (Math.random() * 10 + 1)));
        // 创建一个optional 可能为null
        Optional<Test> optionalMayNull = Optional.ofNullable(Math.random() > 0.5 ? null : new Test(5));
        // 创建一个空的optional
        Optional<Test> optionalEmpty = Optional.empty();
        // isPresent 判断optional是否有值
        System.out.println("----isPresent--start--");
        System.out.println(optional.isPresent());
        System.out.println(optionalMayNull.isPresent());
        System.out.println(optionalEmpty.isPresent());
        System.out.println("----isPresent--end--\n\n");

        // ifPresent 如果存在值，我们执行给定的函数，否则不执行
        System.out.println("----ifPresent--start--");
        optional.ifPresent(test -> System.out.println(test.getMyNumber()));
        System.out.println("----ifPresent--end--\n\n");


        // filter 过滤(其实这个操作更应该应用于流)，给定一个条件，在存在的条件下我们进行判断，返回判断结果
        System.out.println("----filter--start--");
        optional.filter(test -> test.mMyNumber > 5)
                .ifPresent(test -> System.out.println(test.getMyNumber()));
        System.out.println("----filter--end--\n\n");

        // orElse 不存在返回另一个值
        System.out.println("----orElse--start--");
        Test test = optionalMayNull.orElse(new Test(7));
        System.out.println(test.getMyNumber());
        System.out.println("----orElse--end--\n\n");

        // orElseGet 不存在就调用来生成一个
        System.out.println("----orElseGet--start--");
        Test test1 = optionalMayNull.orElseGet(Test::new);
        System.out.println(test1.getMyNumber());
        System.out.println("----orElseGet--end--\n\n");

        // map 映射，若这个optional存在值，则进行映射成另一个对象
        System.out.println("----map--start--");
        Optional<Integer> number = optional.map(Test::getMyNumber);
        number.ifPresent(System.out::println);
        System.out.println("----map--end--\n\n");

        // flatMap 映射 和map类似，只不过它的返回值必须是一个optional 且返回值不会再被optional包装
        System.out.println("----flatMap--start--");
        Optional<Integer> number1 = optional.flatMap(test2 -> Optional.of(88));
        number1.ifPresent(System.out::println);
        System.out.println("----flatMap--end--\n\n");

    }

    private static class Test {
        private final int mMyNumber;

        public Test(int number) {
            this.mMyNumber = number;
        }

        public Test() {
            this.mMyNumber = 666;
        }

        public int getMyNumber() {
            return mMyNumber;
        }
    }
}
