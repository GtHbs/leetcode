package com.leetcode.topic.array.simple;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author 李昭
 * @Date 7:54 2020/4/23
 * @Description:
 * @Modified By:
 */
public class SumZero {

    /**
     * 1304. 和为零的N个唯一整数
     *      给你一个整数 n,请你返回 任意 一个由 n 个 各不相同 的整数组成的数组,并且这 n 个数相加和为 0
     * 解法:
     *      1, 使用对称数组
     *      2, 直接压入数字
     * @param n
     * @return
     */
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0, j = n - 1; i < j; ++i,--j) {
            int left = random.nextInt(1000);
            while (set.contains(left)) {
                left = random.nextInt(1000);
            }
            set.add(left);
            set.add(-left);
            arr[i] = left;
            arr[j] = -left;
        }
        if (n % 2 != 0) {
            arr[n / 2] = 0;
        }
        return arr;
    }

    public int[] sumZero2(int n) {
        int[] arr = new int[n];
        int h = 0;
        for (int i = 1; i < n - 1; ++i) {
            arr[i - 1] = i;
            h += i;
        }
        arr[n - 1] = -h;
        return arr;
    }
}
