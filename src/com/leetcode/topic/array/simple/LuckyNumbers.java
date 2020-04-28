package com.leetcode.topic.array.simple;

import java.util.*;

/**
 * @author 李昭
 * @Date 8:06 2020/4/27
 * @Description:
 * @Modified By:
 */
public class LuckyNumbers {

    /**
     * 1380. 矩阵中的幸运数
     * 给你一个 m * n 的矩阵,矩阵中的数字 各不相同.请你按 任意 顺序返回矩阵中的所有幸运数.
     *
     * 幸运数是指矩阵中满足同时下列两个条件的元素:
     *          在同一行的所有元素中最小
     *          在同一列的所有元素中最大
     * 解法:
     *      1, 暴力法:
     *          使用双循环,先保存每一行最小的元素,再判断该元素是否为该列最小的元素
     * @param matrix
     * @return
     */
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int temp;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; ++i) {
            temp = matrix[i][0];
            int c = 0;
            //1, 找出最小的元素
            for (int j = 1; j < col; ++j) {
                if (temp > matrix[i][j]) {
                    temp = matrix[i][j];
                    c = j;
                }
            }
            boolean flag = true;
            //2, 判断该元素是否为该列最大的值
            for (int j = 0; j < row; ++j) {
                if (matrix[j][c] > temp) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(temp);
            }
        }
        return list;
    }
}
