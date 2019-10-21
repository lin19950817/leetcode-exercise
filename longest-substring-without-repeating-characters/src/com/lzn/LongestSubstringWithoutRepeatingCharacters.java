package com.lzn;

/**
 * 无重复字符的最长子串
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/10/21 16:50
 */
public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * 无重复字符的最长子串
     *  5ms
     *
     * @param s 字符串
     * @author LinZhenNan lin_hehe@qq.com 2019-10-21 21:32
     * @return int
     */
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int[] records = new int[128];
        resetRecords(records);
        int flag = 0;
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            if (records[chars[i]] >= flag && records[chars[i]] != -1) {
                int diff = i - flag;
                if (diff > max) {
                    max = diff;
                }
                flag = records[chars[i]] + 1;
            }
            records[chars[i]] = i;
        }
        int diff = chars.length - flag;
        return diff > max ? diff : max;
    }

    //
    // 私有方法
    // ------------------------------------------------------------------------------

    /**
     * 重置 records
     *
     * @param records 记录
     * @author LinZhenNan lin_hehe@qq.com 2019-10-11 22:30
     */
    private void resetRecords(int[] records) {
        for (int i = 0; i < records.length; i++) {
            if (records[i] != -1) {
                records[i] = -1;
            }
        }
    }


    // 第一名 code
    private int hehe(String s) {
        int maxLength = 0;
        char[] chars = s.toCharArray();
        int leftIndex = 0;
        for (int j = 0; j < chars.length; j++) {
            for (int innerIndex = leftIndex; innerIndex < j; innerIndex++) {
                if (chars[innerIndex] == chars[j]) {
                    maxLength = Math.max(maxLength, j - leftIndex);
                    leftIndex = innerIndex + 1;
                    break;
                }
            }
        }
        return Math.max(chars.length - leftIndex, maxLength);
    }
}
