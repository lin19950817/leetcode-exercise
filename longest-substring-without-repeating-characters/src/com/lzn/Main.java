package com.lzn;

/**
 * description
 *
 * @author LinZhenNan lin.zhennan@hand-china.com 2019/10/21 16:50
 */
public class Main {

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "aab";
        String s5 = "dvdf";
        LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
//        System.out.println(lswrc.lengthOfLongestSubstring(s1));
//        System.out.println(lswrc.lengthOfLongestSubstring(s2));
//        System.out.println(lswrc.lengthOfLongestSubstring(s3));
//        System.out.println(lswrc.lengthOfLongestSubstring(s4));
//        System.out.println(lswrc.lengthOfLongestSubstring(s5));

        System.out.println(lswrc.test("abc"));
        System.out.println(lswrc.test("aa"));
        System.out.println(lswrc.test(" "));
        System.out.println(lswrc.test(s1));
        System.out.println(lswrc.test(s2));
        System.out.println(lswrc.test(s3));
        System.out.println(lswrc.test(s4));
        System.out.println(lswrc.test(s5));
    }


}
