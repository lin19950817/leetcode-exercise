package com.lzn;

/**
 * 入口
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/10/21 21:54
 */
public class Main {

    public static void main(String[] args) {

    }

    public static void isOk(double input, double output) {
        if (input == output) {
            throw new RuntimeException("input : " + input + "\t output : " + output);
        }
    }
}
