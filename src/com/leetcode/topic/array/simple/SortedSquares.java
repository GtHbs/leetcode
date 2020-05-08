package com.leetcode.topic.array.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 李昭
 * @Date 8:20 2020/4/26
 * @Description:
 * @Modified By:
 */
public class SortedSquares {


    /**
     * 977. 有序数组的平方
     *  给定一个按非递减顺序排序的整数数组 A,返回每个数字的平方组成的新数组,
     *  要求也按非递减顺序排序
     * 解法:
     * 1, 暴力法:
     * (1) 算出每个元素的平方
     * (2) 对新数组进行排序
     * 2,
     *
     * @param A
     * @return
     */
    public int[] sortedSquares(int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; ++i) {
            list.add(A[i] * A[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    /**
     * 使用双指针(因为原始数组是非递减的)
     *
     * @param arr
     * @return
     */
    public int[] sortedSquare(int[] arr) {
        int left = 0, right = arr.length - 1;
        int[] a = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; --i) {
            a[i] = arr[right] + arr[left] > 0 ? (int)Math.pow(arr[right--],2.0) : (int)Math.pow(arr[left++],2.0);
        }
        return a;
    }
}
