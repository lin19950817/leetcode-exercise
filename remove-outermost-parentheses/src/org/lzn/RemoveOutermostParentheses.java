package org.lzn;

import java.util.Arrays;
import java.util.Stack;

/**
 * 删除最外层的括号
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/11/27 21:58
 */
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        if (S == null || S.length() == 0) {
                throw new IllegalArgumentException("No remove outer parentheses");
        }


        char[] cs = S.toCharArray();
        int len = cs.length;
        Stack<Character> stack = new Stack<>();
        // 是否左边最外层的 "("，用于判断是否删除最外层的括号
        boolean isLeftOutermost = true;
        // 逆向进栈
        for (int i = 0; i < len; i++) {
            int sum = 0;
            // 判断是否左边最外层的 "("
            if (sum == 0 && isLeftOutermost && cs[len] == '('){
                isLeftOutermost = false;
                continue;
            }
            // 判断是否右边边最外层的 ")"
            if (sum == 0 && !isLeftOutermost && cs[len] == ')') {
                isLeftOutermost = true;
                continue;
            }
            sum += cs[len] == '(' ? 1 : -1;
            stack.push(cs[len]);
        }
        return stack.toString();
    }
}
