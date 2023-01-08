package com.lln.java8.functional.test22;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("assets/a.txt");
        new BufferedReader(new FileReader(file))
                .lines()
                .forEach(System.out::println);

    }
}
