package com.lzn;

/**
 * 整数反转
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/10/24 23:04
 */
public class ReverseInteger {
    public int reverse(int x) {
        // 整数最大值
        char[] max = Integer.toString(~0 >>> 1).toCharArray();
        String xStr = Integer.toString(x);
        char[] chars;
        boolean isPositive;
        if ('-' == xStr.charAt(0)) {
            isPositive = false;
            chars = xStr.substring(1).toCharArray();
        } else {
            isPositive = true;
            chars = xStr.toCharArray();
        }
        StringBuilder sb = new StringBuilder();
        int last = chars.length - 1;
        if (max.length > chars.length) {

        } else if (max.length == chars.length) {
            for (int i = last; i > 0; i--) {
                if (chars[i] > max[last - i]) {
                    return 0;
                }
            }
            if (isPositive) {
                if (chars[0] > max[0]) {
                    return 0;
                }
            } else {
                if (chars[0] > max[0] + 1) {
                    return 0;
                }
                sb.append('-');
            }
        } else {
            return 0;
        }
        for (int i = last; i >= 0; i--) {
            sb.append(chars[last]);
        }
        return Integer.parseInt(sb.toString());
    }
}
