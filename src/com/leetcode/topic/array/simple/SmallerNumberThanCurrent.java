package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 */
public class SmallerNumberThanCurrent {
    /**
     * 1365.有多少小于当前数字的数字
     * <p>
     * 给你一个数组 nums,对于其中每个元素 nums[i],请你统计数组中比它小的所有数字的数目.
     * 换而言之,对于每个 nums[i] 你必须计算出有效的 j 的数量,
     * 其中 j 满足 j != i 且 nums[j] < nums[i] 
     * 解法:
     *  1, 暴力法
     *      使用两次循环,第一次循环遍历数组元素,第二次循环判断有多少元素小于当前元素
     *      时间复杂度为O(n²),空间复杂度为O(1),只需要一个临时变量
     *
     * @param nums
     * @return
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int temp,count = 0;
        for (int i = 0; i < nums.length; ++i) {
            count = 0;
            temp = nums[i];
            for (int j = 0; j < nums.length; ++j) {
                if (i == j) {
                    continue;
                }
                if (nums[j] < temp) {
                    ++count;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
