package com.lzn;

/**
 * 入口
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/10/24 23:06
 */
public class Main {

    public static void main(String[] args) {
        int i1 = 0;
        int i2 = 2147483647;
        int i3 = -2147483648;
        int i4 = -2147483641;
        int i5 = 1234567000;

        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(i1));
        System.out.println(reverseInteger.reverse(i2));
        System.out.println(reverseInteger.reverse(i3));
        System.out.println(reverseInteger.reverse(i4));
        System.out.println(reverseInteger.reverse(i5));
    }
}
