package com.lzn;

/**
 * description
 *
 * @author LinZhenNan lin.zhennan@hand-china.com 2019/10/21 16:50
 */
public class Main {

    public static void main(String[] args) {
        String q1 = "abcabcbb";
        String q2 = "bbbbb";
        String q3 = "pwwkew";
        String q4 = "aab";
        String q5 = "dvdf";

        int a1 = 3;
        int a2 = 1;
        int a3 = 3;
        int a4 = 2;
        int a5 = 3;

        LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
        isOk(lswrc.lengthOfLongestSubstring(q1), a1);
        isOk(lswrc.lengthOfLongestSubstring(q2), a2);
        isOk(lswrc.lengthOfLongestSubstring(q3), a3);
        isOk(lswrc.lengthOfLongestSubstring(q4), a4);
        isOk(lswrc.lengthOfLongestSubstring(q5), a5);
    }

    public static void isOk(int input, int output) {
        if (input == output) {
            throw new RuntimeException("input : " + input + "\t output : " + output);
        }
    }
}
