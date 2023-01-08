package com.lln.java8.functional.test18;

import java.awt.Color;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // 现在我们有100个组件 每个组件由颜色和权重组成，我们需要求红色的权重
        List<Widget> widgets = IntStream.range(0, 100)
                .mapToObj(value -> new Widget(getRandomColor(), (int) (Math.random() * 100)))
                .collect(Collectors.toList());

        // 如果使用传统方案，应该是这样
        int redWeight = 0;
        for (Widget widget : widgets) {
            if (widget.getColor() == Color.RED) {
                redWeight += widget.getWeight();
            }
        }
        System.out.println("红色的权重为: " + redWeight);

        // 如果使用流，它可以这样写
        System.out.println("红色的权重为: " +
                widgets.stream()
                        .filter(widget -> widget.getColor() == Color.RED)
                        .mapToInt(Widget::getWeight)
                        .sum());
    }

    private static Color getRandomColor() {
        switch ((int) (Math.random() * 5)) {
            case 0:
                return Color.RED;
            case 1:
                return Color.BLACK;
            case 2:
                return Color.YELLOW;
            case 3:
                return Color.ORANGE;
            case 4:
                return Color.BLUE;
            default:
                return Color.WHITE;
        }
    }

    private static class Widget {
        private Color mColor;
        private int mWeight;

        public Widget(Color color, int weight) {
            this.mColor = color;
            this.mWeight = weight;
        }

        public Color getColor() {
            return mColor;
        }

        public void setColor(Color color) {
            mColor = color;
        }

        public int getWeight() {
            return mWeight;
        }

        public void setWeight(int weight) {
            mWeight = weight;
        }
    }
}
