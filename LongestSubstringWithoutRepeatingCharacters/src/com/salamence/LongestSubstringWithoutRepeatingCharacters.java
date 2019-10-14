package com.salamence;

/**
 * 无重复字符的最长子串
 *
 * @author lin19 lin_hehe@qq.com 2019/10/11 22:20
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * 无重复字符的最长子串
     *
     * @param s 字符串
     * @return int
     * @author lin19 lin_hehe@qq.com 2019-10-11 22:21
     */
    public int lengthOfLongestSubstring(String s) {
        int[] records = new int[128];
        int length = s.length();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (records[c] != -1) {
                if (sum > max) {
                    max = sum;
                }
                resetRecords(records);
                records[c] = i;
                sum = 1;
            } else {
                records[c] = i;
                sum++;
            }
        }
        return sum > max ? sum : max;

       // int length = s.length();
       // int max = 0;
       // for (int i = 0; i < length; i++) {
           // int len = longestLengthOfTheSameInitials(s, i);
           // if (len > max) {
               // max = len;
           // }
       // }
       // return max;
    }

    //
    // 私有方法
    // ------------------------------------------------------------------------------

    /**
     * 重置 records
     *
     * @param records 记录
     * @author lin19 lin_hehe@qq.com 2019-10-11 22:30
     */
    private void resetRecords(int[] records) {
        for (int i = 0; i < records.length; i++) {
            if (records[i] != -1) {
                records[i] = -1;
            }
        }
    }
    
    private void resetRecordsOfBeforeSameInitial(int[] records, ) {
        
    }

    /**
     * 从下标 startSubscript开始与首字母相同的最长子串
     *
     * @param s 字符串
     * @param startSubscript 开始下标，首字母的下标
     * @return int
     * @author lin19 lin_hehe@qq.com 2019-10-11 23:06
     */
    private int longestLengthOfTheSameInitials(String s, int startSubscript) {
        int length = s.length();
        if (startSubscript >= length) {
            throw new IllegalArgumentException("start subscript bigger than length of string");
        }
        char initial = s.charAt(startSubscript);
        for (int i = startSubscript + 1; i < length; i++) {
            if (s.charAt(i) == initial) {
                return i - startSubscript;
            }
        }
        return length - startSubscript;
    }
}
