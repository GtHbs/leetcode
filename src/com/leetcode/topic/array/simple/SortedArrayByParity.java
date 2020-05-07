package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 * @Date 8:05 2020/5/7
 * @Description:
 * @Modified By:
 */
public class SortedArrayByParity {


    /**
     * 905. 按奇偶排序数组
     *  给定一个非负整数数组 A,返回一个数组，在该数组中,
     *  A 的所有偶数元素之后跟着所有奇数元素
     *  解法:
     *      1, 暴力法:双端指针遍历
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int temp;
        int j = length - 1;
        for (int i = 0; i < length; i++) {
            if (A[i] % 2 != 0) {
                temp = A[i];
                while (j > i) {
                    if (A[j] % 2 == 0) {
                        A[i] = A[j];
                        A[j] = temp;
                        break;
                    }
                    --j;
                }
            }
        }
        return A;
    }



}
