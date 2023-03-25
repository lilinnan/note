package com.lln.java14.test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        // 这是以前的switch
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other " + num);
                break;
        }
        // 这是增强的switch
        switch (num) {
            case 0 -> {
                // 多行语句使用{}包裹
                System.out.println("zero");
                System.out.println("zero");
            }
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            default -> System.out.println("other " + num);
        }
    }
}
