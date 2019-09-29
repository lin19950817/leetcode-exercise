package com.salamence;

import java.util.Arrays;

/**
 * 程序入口类
 *
 * @author LinZhenNan 2019/09/29 23:45
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = new TwoSum().twoSum(a, target);
        System.out.println(Arrays.toString(result));
    }

}
