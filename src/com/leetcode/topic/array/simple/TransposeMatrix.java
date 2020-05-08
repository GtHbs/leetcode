package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 * @Date 8:12 2020/5/8
 * @Description:
 * @Modified By:
 */
public class TransposeMatrix {

    /**
     * 867. 转置矩阵
     *      1, 暴力法{复杂度O(n²)}
     *      2,
     *
     * @param A
     * @return
     */
    public int[][] transpose(int[][] A) {
        int[][] arr = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                arr[j][i] = A[i][j];
            }
        }
        return arr;
    }
}
