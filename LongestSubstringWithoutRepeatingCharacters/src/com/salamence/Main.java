package com.salamence;

/**
 * 程序入口
 *
 * @author lin19 lin_hehe@qq.com 2019/10/11 22:22
 */
public class Main {

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "aab";
        String s5 = "dvdf";
        LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(lswrc.lengthOfLongestSubstring(s1));
        System.out.println(lswrc.lengthOfLongestSubstring(s2));
        System.out.println(lswrc.lengthOfLongestSubstring(s3));
        System.out.println(lswrc.lengthOfLongestSubstring(s4));
        System.out.println(lswrc.lengthOfLongestSubstring(s5));
    }


}
