package com.lln.java9.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 这是最传统的读取文件的代码，一堆try catch样板代码
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("MyFilePath"));
            // 读取文件
            int read = fileInputStream.read();
        } catch (IOException e) {
            // 处理异常
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    // 再次处理异常
                }
            }
        }

        // 幸好在Java7中引入了try-with-resources，能够自动关闭实现了AutoCloseable接口的流，所以上面的代码可以被修改为
        try (FileInputStream fileInputStream2 = new FileInputStream(new File("MyFilePath"))) {
            int read = fileInputStream2.read();
            // 读取文件
        } catch (IOException e) {
            // 处理异常
        }

        // 由于在资源内我们可以放进去多个需要关闭的资源，写多个可能看起来不得劲，所以在Java9中增加了在try之前定义这些资源的能力
        // 这个资源必须是实际上的final类型
        FileInputStream fileInputStream3 = new FileInputStream(new File("MyFilePath"));
        final FileInputStream fileInputStream4 = new FileInputStream(new File("MyFilePath"));
        FileInputStream fileInputStream5 = new FileInputStream(new File("MyFilePath"));
        // 这不行，这改了变量了，不是final了
        // fileInputStream5 = new FileInputStream("MyFilePath");
        try (fileInputStream3; fileInputStream4; fileInputStream5) {
            int read = fileInputStream3.read();
            // 读取文件
        } catch (IOException e) {
            // 处理异常
        }
    }
}
