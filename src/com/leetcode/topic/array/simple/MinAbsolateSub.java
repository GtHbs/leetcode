package com.leetcode.topic.array.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 李昭
 * @Date 8:01 2020/5/19
 * @Description:
 * @Modified By:
 */
public class MinAbsolateSub {


    /**
     * 1200. 最小绝对差
     *       给你个整数数组 arr，其中每个元素都 不相同.
     *       请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回
     * 实例:
     *     输入：arr = [4,2,1,3]
     *     输出：[[1,2],[2,3],[3,4]]
     *     输入：arr = [1,3,6,10,15]
     *     输出：[[1,3]]
     * 解法:
     *     1, 暴力法:
     *        遍历每一个元素与其他元素的绝对差
     * @param arr
     * @return
     */
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        //1, 对数组进行排序,避免之后的绝对差计算
        Arrays.sort(arr);
        int min = Integer.MIN_VALUE;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //绝对差
                int diff = arr[j] - arr[i];
                //2, 小于绝对差就清空list,重新插入值
                if (diff < min) {
                    lists.clear();
                    lists.add(Arrays.asList(arr[i],arr[j]));
                    min = diff;
                } else if (min == diff) {
                    lists.add(Arrays.asList(arr[i],arr[j]));
                } else {
                    break;
                }
            }
        }
        return lists;
    }
}
