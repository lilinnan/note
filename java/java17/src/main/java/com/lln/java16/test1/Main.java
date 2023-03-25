package com.lln.java16.test1;

public class Main {
    public static void main(String[] args) {
        test(new Test1());
        test(new Test2());
        test(new Test3());

    }

    private static class Test1 {
        void test1() {
            System.out.println("test1");
        }
    }

    private static class Test2 {
        void test2() {
            System.out.println("test2");
        }
    }

    private static class Test3 {
        void test3() {
            System.out.println("test3");
        }
    }

    private static void test(Object o) {
        // 传统方法
        if (o instanceof Test1) {
            ((Test1) o).test1();
        } else if (o instanceof Test2) {
            ((Test2) o).test2();
        } else if (o instanceof Test3) {
            ((Test3) o).test3();
        }
        // 智能转型
        if (o instanceof Test1 test1) {
            test1.test1();
        } else if (o instanceof Test2 test2) {
            test2.test2();
        } else if (o instanceof Test3 test3) {
            test3.test3();
        }
    }
}
