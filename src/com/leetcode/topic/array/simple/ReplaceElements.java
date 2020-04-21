package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 */
public class ReplaceElements {

    /**
     * 1299. 将每个元素替换为右侧最大元素
     *  给你一个数组 arr,请你将每个元素用它右边最大的元素替换,如果是最后一个元素,用 -1 替换
     *  解法:
     *      1, 暴力法
     *         使用双重循环,遍历每个元素,进行替换
     *      2, 从后向前扫描
     *
     * @param arr
     * @return
     */
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int temp;
        for (int i = 0; i < length - 1; ++i) {
            temp = arr[i + 1];
            for (int j = i + 1; j < length; ++j) {
                if (temp < arr[j]) {
                    temp = arr[j];
                }
            }
            arr[i] = temp;
        }
        arr[length - 1] = -1;
        return arr;
    }

    public int[] backReplaceElements(int[] arr) {
        int length = arr.length;
        int temp,max = -1;
        for (int i = length - 1; i >= 0; --i) {
            temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return arr;
    }
}
