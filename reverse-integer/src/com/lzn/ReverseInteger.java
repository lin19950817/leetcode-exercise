package com.lzn;

/**
 * 整数反转
 *  3ms
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
        // 尾部是否为零
        boolean tailZero = true;
        for (int i = last; i >= 0; i--) {
            if (tailZero && chars[i] != '0') {
                tailZero = false;
            }
            if (!tailZero) {
                sb.append(chars[i]);
            }
        }

        // 是否溢出
        chars = sb.toString().toCharArray();
        // 空字符串返回 0
        if (0 == sb.length() || chars.length > max.length) {
            return 0;
        } else if (chars.length == max.length) {
            boolean equal = true;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] > max[i]) {
                    return 0;
                } else if (chars[i] < max[i]) {
                    equal = false;
                    break;
                }
            }
            if (equal) {
                last = max.length - 1;
                // 判断是否溢出。补码，最小值的绝对值比最大值大一
                boolean overflow = (isPositive && chars[last] > max[last]) || (!isPositive && chars[last] > max[last] + 1);
                if (overflow) {
                    return 0;
                }
            }
        }
        if (!isPositive) {
            sb.insert(0, '-');
        }
        return Integer.parseInt(sb.toString());
    }
}
