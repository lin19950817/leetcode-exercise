package com.lzn;

/**
 * 寻找两个有序数组的中位数
 *
 * @author LinZhenNan lin_hehe@qq.com 2019/10/21 21:47
 */
public class MedianOfTwoSortedArrays {

    /**
     * 在排序数组中寻找中位数
     *
     * @param nums1 数组1
     * @param nums2 数组2
     * @author LinZhenNan lin_hehe@qq.com 2019-10-21 21:53
     * @return double
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    }
    public int getValueByRank(int[] nums1, int[] nums2, int rank, int left, int right) {
        int leftFlag = left;
        int rightFlag = right;
        int temp = left > nums1.length ? nums2[left - nums1.length] : nums1[left];
        while (rightFlag > leftFlag) {
            while (rightFlag > leftFlag) {
                if (rightFlag >= nums1.length) {
                    if (nums2[rightFlag - nums1.length] < temp) {
                        break;
                    }
                } else {
                    if (nums1[rightFlag] < temp) {
                        break;
                    }
                }
                rightFlag--;
            }
//            while (rightFlag > leftFlag) {
                if (leftFlag >= nums1.length) {
                    if (nums2[leftFlag - nums1.length] > temp) {
                        break;
                    }
                } else {
                    if (nums1[leftFlag] > temp) {
                        break;
                    }
                }
                leftFlag++;
            }
            if (leftFlag == rightFlag) {
                if (leftFlag > nums1.length) {
                    if (rightFlag > nums1.length) {
                        int _left = leftFlag - nums1.length;
                        int _right = rightFlag - nums1.length;
                        temp = nums2[_left];
                        nums2[_left] = nums2[_right];
                        nums2[_right] = temp;
                    }
                } else {
                    if (rightFlag > nums1.length) {
                        int _right = rightFlag - nums1.length;
                        temp = nums1[leftFlag];
                        nums1[leftFlag] = nums2[_right];
                        nums2[_right] = temp;
                    } else {
                        temp = nums1[leftFlag];
                        nums1[leftFlag] = nums1[rightFlag];
                        nums1[rightFlag] = temp;
                    }
                }
//            }
        }
        if (rightFlag == rank) {
            return temp;
        } else if (rightFlag > rank) {
            return getValueByRank(nums1, nums2, rank, left, rightFlag + 1);
        } else {
            return getValueByRank(nums1, nums2, rank, rightFlag + 1, right);
        }

    }
}
