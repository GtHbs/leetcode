package com.leetcode.topic.array.simple;

import java.util.ArrayList;

/**
 * @author 李昭
 */
public class DeCompressList {

    /**
     * 1313. 解压缩编码列表
     * <p>
     * 考虑每对相邻的两个元素 freq, val] = [nums[2*i],nums[2*i+1]] (其中 i >= 0 ),
     * 每一对都表示解压后子列表中有 freq 个值为 val 的元素,
     * 你需要从左到右连接所有子列表以生成解压后的列表.
     * <p>
     * 暴力解法:
     *  从前到后遍历整个数据,将元素存储在list中,最后转换为数组返回
     *  时间复杂度为O(n²),空间复杂度为O(n)
     * @param nums
     * @return
     */
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; ++j) {
                list.add(nums[i + 1]);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
