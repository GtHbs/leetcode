package com.leetcode.topic.array.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李昭
 */
public class WithSequenceCreateArray {

    /**
     * 1389. 按既定顺序创建目标数组
     * 给你两个整数数组 nums 和 index.
     * 你需要按照以下规则创建目标数组：
     *      1. 目标数组 target 最初为空.
     *      2. 按从左到右的顺序依次读取 nums[i] 和 index[i],
     *         在 target 数组中的下标 index[i] 处插入值 nums[i].
     *      3. 重复上一步,直到在 nums 和 index 中都没有要读取的元素.
     * 请你返回目标数组
     *
     * 解法:
     *  1, 暴力法
     *     使用一个list用来存储存入元素,因为index数组中的元素最大值不知道
     *
     * @param nums
     * @param index
     * @return
     */
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; ++i) {
            list.add(index[i],nums[i]);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
