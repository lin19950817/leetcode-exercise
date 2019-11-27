package org.lzn;

/**
 * 猜数字
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/11/27 21:23
 */
public class GuessNumbers {
    /**
     * 猜数字
     *
     * @param guess
     * @param answer
     * @author LinZhenNan lin_hehe@qq.com 2019-11-27 21:24
     * @return int
     */
    public int game(int[] guess, int[] answer) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i]) {
                sum++;
            }
        }
        return sum;
    }
}
