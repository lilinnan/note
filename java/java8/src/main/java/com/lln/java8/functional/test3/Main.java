package com.lln.java8.functional.test3;

import com.lln.java8.widget.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        View.OnClickListener onClickListener = v -> System.out.println("我被点击了");
        view.setOnClickListener(onClickListener);
        view.click();

        View view2 = new View();
        view2.setOnClickListener(v -> System.out.println("我被点击了"));
        view2.click();
    }
}
