package com.salamence;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author LinZhenNan 2019/09/29 17:50
 */
public class TwoSum {

    /**
     * 两数之和
     *  遍历 nums并分别与计算与 target的差 minus，使用 map记录，
     *  key为 num，value为 num下标。每次遍历计算差时查看 map(key = minus)
     *  中是否有记录,如果有则返回结果，没有则将 key = num记录进 map
     *
     * @param nums
     * @param target
     * @author LinZhenNan 598296448@qq.com 2019-09-29 23:35
     * @return int[]
     */
    public int[] twoSum(int[] nums, int target) {
        // 用来记录，key为 num，value为 num下标
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            // 计算目标值与 num的差
            int minus = target - nums[i];
            // 取出记录中 key为目标值的下标
            Integer sub = map.get(minus);
            if (null == sub) {
                if (null == map.get(nums[i])) {
                    // 如果目标值和 num都没有记录则将当前 num记录
                    map.put(nums[i], i);
                }
            } else {
                // 在记录中找到目标值的下标则返回结果
                return new int[]{sub, i};
            }
        }
        // 遍历 nums都没有找到和为目标值的数组
        return null;
    }
}
