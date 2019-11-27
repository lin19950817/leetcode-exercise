package org.lzn;

import java.util.HashMap;
import java.util.Map;

/**
 * 入口
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/11/27 21:58
 */
public class Main {
    // case
    private static Map<String, String> c;
    static {
        c = new HashMap<>(16);
        c.put("(()())(())", "()()()");
        c.put("(()())(())(()(()))", "()()()()(())");
        c.put("()()", "");
    }
    public static void main(String[] args) {
        RemoveOutermostParentheses rop = new RemoveOutermostParentheses();
        for (Map.Entry<String, String> item : c.entrySet()) {
            isOk(rop.removeOuterParentheses(item.getKey()), item.getValue());
        }
    }

    public static void isOk(String input, String output) {
        if (!input.equals(output)) {
            throw new RuntimeException("input: " + input + "\toutput: " + output);
        }
    }
}
