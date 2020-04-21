package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 * @Date 8:04 2020/4/22
 * @Description:    奇数值单元格的数目
 * @Modified By:
 */
public class OddCells {


    /**
     * 1252. 奇数值单元格的数目
     *      给你一个 n 行 m 列的矩阵,最开始的时候,每个单元格中的值都是 0.
     *      另有一个索引数组 indices,indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）.
     *      你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1.
     *      请你在执行完所有 indices 指定的增量操作后,返回矩阵中 「奇数值单元格」的数目
     * 解法:
     *      1, 暴力法
     *          先填充新数组,再对数组元素进行添加,最后统计,时间复杂度O(n²),空间复杂度O(n*m)
     *      2,
     * @param n
     * @param m
     * @param indices
     * @return
     */
    public int oddCells(int n, int m, int[][] indices) {
        int[][] arr = new int[n][m];
        /**
         * 1, 按照题目规则对新建数组进行填充
         */
        for (int i = 0; i < indices.length; ++i) {
            //需要填充的行
            int row = indices[i][0];
            //需要填充的列
            int col = indices[i][1];
            //对行进行+1
            for (int j = 0; j < m; ++j) {
                arr[row][j] += 1;
            }
            //对列+1
            for (int j = 0; j < n; ++j) {
                arr[j][col] += 1;
            }
        }
        int count = 0;
        /**
         * 2, 计算奇数元素个数
         */
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (arr[i][j] % 2 != 0) {
                    ++count;
                }
            }
        }
        return count;
    }
}
