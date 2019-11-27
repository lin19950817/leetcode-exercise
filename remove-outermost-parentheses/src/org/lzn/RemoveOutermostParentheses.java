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
        int sum = 0;
        // 逆向进栈
        for (int i = 0; i < len; i++) {
            // 判断是否左边最外层的 "("
            if (sum == 0 && isLeftOutermost && cs[i] == '('){
                isLeftOutermost = false;
                continue;
            }
            // 判断是否右边边最外层的 ")"
            if (sum == 0 && !isLeftOutermost && cs[i] == ')') {
                isLeftOutermost = true;
                continue;
            }
            sum += cs[i] == '(' ? 1 : -1;
            stack.push(cs[i]);
        }
        StringBuilder sb = new StringBuilder();
        len = stack.size();
        for(int i = 0; i < len; i++) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
