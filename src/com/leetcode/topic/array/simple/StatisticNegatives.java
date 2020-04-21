package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 */
public class StatisticNegatives {

    /**
     * 1351. 统计有序矩阵中的负数
     *  给你一个 m * n 的矩阵 grid,矩阵中的元素无论是按行还是按列,都以非递增顺序排列.
     *  请你统计并返回 grid 中 负数 的数目
     *
     * 解法:
     *    1, 暴力法,双重循环,时间复杂度O(n²),空间复杂度O(1)
     *    2, 回溯法
     *         因为数组排列为非递增,所以可以从后向前进行遍历直到出现0或者大于零为止
     *
     * @param grid
     * @return
     */
    public int countNegatives(int[][] grid) {
        int outerLength = grid.length;
        int innerLength = grid[0].length;
        int count = 0;
        for (int i = 0; i < outerLength; ++i) {
            for (int j = 0; j < innerLength; ++j) {
                if (grid[i][j] < 0) {
                    ++count;
                }
            }
        }
        return count;
    }

    public int countNegativesWithBackTraverse(int[][] grid) {
        int outerLength = grid.length;
        int innerLength = grid[0].length;
        int count = 0;
        for (int i = outerLength - 1; i >= 0; --i) {
            for (int j = innerLength - 1; j >= 0; --j) {
                if (grid[i][j] < 0) {
                    ++count;
                } else if (grid[i][j] >= 0) {
                    break;
                }
            }
        }
        return count;
    }
}
