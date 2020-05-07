package com.leetcode.topic.array.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 李昭
 * @Date 8:16 2020/5/7
 * @Description:
 * @Modified By:
 */
public class FindLuckyNumber {

    /**
     * 1394. 找出数组中的幸运数
     *      在整数数组中,如果一个整数的出现频次和它的数值大小相等,我们就称这个整数为「幸运数」.
     *      给你一个整数数组 arr,请你从中找出并返回一个幸运数.
     *      如果数组中存在多个幸运数.只需返回 最大 的那个.
     *      如果数组中不含幸运数，则返回 -1
     *  解法:
     *      1, 暴力法
     *         对每一个数字进行遍历,使用map将所有的数字和其出现的次数进行存储,适用于无范围的查找
     *      2, 统计词频
     *         由于题目数字有范围可以使用该方法
     *
     * @param arr
     * @return
     */
    public int findLucky(int[] arr) {
        int luckyNumber = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                Integer integer = map.get(arr[i]);
                map.put(arr[i],++integer);
            } else {
                map.put(arr[i],1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer,Integer> entry : entries) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if ((value == key) && luckyNumber < key) {
                luckyNumber = key;
            }
        }
        return luckyNumber;
    }

    public int findLucky2(int[] arr) {
        int[] freq = new int[501];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 500; i > 0; i--) {
            if (freq[i] == i) {
                return i;
            }
        }
        return -1;
    }
}
