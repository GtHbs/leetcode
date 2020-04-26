package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 * @Date 7:54 2020/4/24
 * @Description:
 * @Modified By:
 */
public class HightChecker {

    /**
     * 1051. 高度检查器
     *  学校在拍年度纪念照时,一般要求学生按照 非递减 的高度顺序排列.
     *  请你返回能让所有学生以 非递减 高度排列的最小必要移动人数
     *  注意,当一组学生被选中时,他们之间可以以任何可能的方式重新排序,而未被选中的学生应该保持不动
     * 解法:
     *      1, 暴力法
     *      2, 桶排序
     * @param heights
     * @return
     */
    public int heightChecker(int[] heights) {
        boolean flag;
        int temp;
        int length = heights.length;
        int[] s = heights.clone();
        int count = 0;
        for (int i = length - 1; i >= 1; --i) {
            flag = false;
            for (int j = 1; j <= i; ++j) {
                if (heights[j - 1] > heights[j]) {
                    temp = heights[j - 1];
                    heights[j - 1] = heights[j];
                    heights[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        for (int i = 0; i < length; ++i) {
            if (s[i] != heights[i]) {
                ++count;
            }
        }
        return count;
    }

    /**
     * 桶排序法:
     *      1,
     * @param heights
     * @return
     */
    public int heightChecker2(int[] heights) {
        //heights的值范围为1-100,每个元素需要一个桶,因此为101个
        int[] arr = new int[101];
        for (int height : heights) {
            arr[height]++;
        }
        int count = 0;
        for (int i = 1, j = 0; i < arr.length; ++i) {
            while (arr[i]-- > 0) {
                if (heights[j++] != i) {
                    count++;
                }
            }
        }
        return count;
    }
}
