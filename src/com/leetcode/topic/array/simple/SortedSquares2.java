package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 * @Date 8:21 2020/5/8
 * @Description:
 * @Modified By:
 */
public class SortedSquares2 {
    /**
     * 922. 按奇偶排序数组 II
     *      给定一个非负整数数组 A,A中一半整数是奇数,一半整数是偶数.
     *      对数组进行排序，以便当 A[i] 为奇数时,i也是奇数;
     *      当 A[i] 为偶数时,i 也是偶数.
     *      你可以返回任何满足上述条件的数组作为答案
     *   解法:
     *      1, 暴力法
     *         使用双指针,i每次都是偶数,j每次都是奇数
     *         时间复杂度低为O(n)空间复杂度高为O(n)效率相对较高
     *      2, 循环遍历,复杂度O(n²)但是空间复杂度低为O(1)
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length - 1; i = i + 2) {
            //1, 找出偶数位置上不为偶数的元素
            if ((A[i] & 1) != 0) {
                //2, 找出奇数位置上不为奇数的元素
                while ((A[j] & 1) != 0) {
                    j = j + 2;
                }
                //3, 将两个数进行调换
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }

    public int[] sortArrayByParity(int[] arr) {
        int[] result = new int[arr.length];
        int i = 0,j = 1,k = 0;
        for (;i < arr.length; ++i) {
            if ((arr[i] & 1) == 0) {
                result[k] = arr[i];
                k += 2;
            } else {
                result[j] = arr[i];
                j += 2;
            }
        }
        return result;
    }
}
