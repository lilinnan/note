package com.lln.java14.test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        var result = switch (num) {
            case 0 -> {
                System.out.println("zero");
                yield "zero";
            }
            // 如果只有一行，就不需要yield
            case 1 -> "one";
            case 2 -> "two";
            default -> "other " + num;
        };
        System.out.println(result);
    }
}
