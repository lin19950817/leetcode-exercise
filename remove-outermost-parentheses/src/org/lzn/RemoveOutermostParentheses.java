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
        StringBuffer sb = new StringBuffer();
        // 是否左边最外层的 "("，用于判断是否删除最外层的括号
        boolean isLeftOutermost = true;
        int sum = 0;
        for (char c : cs) {
            // 判断是否左边最外层的 "("
            if (sum == 0 && isLeftOutermost && c == '('){
                isLeftOutermost = false;
                continue;
            }
            // 判断是否右边边最外层的 ")"
            if (sum == 0 && !isLeftOutermost && c == ')') {
                isLeftOutermost = true;
                continue;
            }
            sum += c == '(' ? 1 : -1;
            sb.append(c);
        }
        return sb.toString();
    }
}
