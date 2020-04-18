package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 * @date
 */
public class FindMiddleNumbers {
    /**
     * 1295. 统计位数为偶数的数字
     * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数
     * <p>
     * 解法:
     * (1) 暴力破解:
     * 使用两个函数,一个循环数组,另一个判断是否为偶数
     *
     * @param nums
     * @return
     */
    public int findNumbers(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; ++i) {
            if (isOdd(nums[i])) {
                count++;
            }
        }
        return count;
    }

    public boolean isOdd(int number) {
        int res = 0;
        int i = 10;
        while (number != 0) {
            number = number / i;
            res++;
        }
        return res % 2 == 0;
    }
}
