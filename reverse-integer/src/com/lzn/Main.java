package com.lzn;

import java.util.HashMap;
import java.util.Map;

/**
 * 入口
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/10/24 23:06
 */
public class Main {
    /**
     * case, key 实例, value 结果
     */
    public static Map<Integer, Integer> c;

    static {
        c = new HashMap<>(16);
        c.put(0, 0);
        c.put(2147483647, 0);
        c.put(-2147483648, 0);
        c.put(-2147483641, -1463847412);
        c.put(1234567000, 7654321);
    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        for (Integer item :
                c.keySet()) {
            isOk(item, r.reverse(item), c.get(item));
        }
    }

    public static void isOk(int input, int output, int answer) {
        if (output != answer) {
            throw new RuntimeException("input : " + input + "\t output : " + output + "\t answer" + answer);
        }
    }
}
