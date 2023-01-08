package com.lln.java8.functional.test2;

import com.lln.java8.widget.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("我被点了");
            }
        });
        view.click();
    }
}
