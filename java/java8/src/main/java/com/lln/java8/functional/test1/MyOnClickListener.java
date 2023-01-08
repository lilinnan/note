package com.lln.java8.functional.test1;

import com.lln.java8.widget.View;

public class MyOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        System.out.println("我被点了~");
    }
}
