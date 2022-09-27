package com.nowcoder.community;

import io.lettuce.core.ScanStream;

import java.io.IOException;

public class Wktests {

    public static void main(String[] args) {
        String cmd = "D:/Program Files/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com e:/work/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
