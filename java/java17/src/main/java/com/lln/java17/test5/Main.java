package com.lln.java17.test5;

public class Main {

    public sealed static class Test {

    }

    public static final class Test1 extends Test {

    }

    public static final class Test2 extends Test {

    }

    public static void main(String[] args) {
        Class<?>[] permittedSubclasses = Test.class.getPermittedSubclasses();
        for (var c : permittedSubclasses) {
            System.out.println(c.getSimpleName());
        }
    }
}
