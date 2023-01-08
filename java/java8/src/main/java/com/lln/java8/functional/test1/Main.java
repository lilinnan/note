package com.lln.java8.functional.test1;

import com.lln.java8.widget.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        view.setOnClickListener(new MyOnClickListener());
        view.click();
    }
}
