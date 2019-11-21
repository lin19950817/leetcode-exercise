package com.lzn;

/**
 * 整数反转
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/10/24 23:04
 */
public class ReverseInteger {
    public int reverse(int x) {
        // 整型最大值，避免溢出，判断个位以外的所有位
        int max = (-1 >>> 1) / 10;
        // 整型最小值，避免溢出，判断个位以外的所有位
        int min = (1 << 31) / 10;
        // x 是否为正数
        boolean isPositive = x > 0 ? true : false;
        // x 反转的数，reverse 但与方法重名，所以简写
        int rev = 0;
        while (x != 0) {
            // 求个位的数
            int m = x % 10;
            // x 去掉个位数
            x /= 10;
            // 如果 x 为正数则判断是否溢出，溢出则返回 0
            if (isPositive){
                if (rev > max || (rev == max && m > 7)) {
                    return 0;
                }
            } else {
                // 如果 x 为负数，判断是否溢出，溢出则返回 0
                if (rev < min || (rev == min && m < -8)) {
                    return 0;
                }
            }
            rev = rev * 10 + m;
        }
        return rev;
    }
}
