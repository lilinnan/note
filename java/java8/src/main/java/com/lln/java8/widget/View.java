package com.lln.java8.widget;

public class View {
    private OnClickListener mOnClickListener;

    public void click() {
        if (mOnClickListener == null) {
            return;
        }
        mOnClickListener.onClick(this);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    @FunctionalInterface
    public interface OnClickListener {
        void onClick(View view);
    }
}
