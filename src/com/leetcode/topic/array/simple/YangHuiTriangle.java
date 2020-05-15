package com.leetcode.topic.array.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李昭
 * @Date 8:08 2020/5/15
 * @Description:
 * @Modified By:
 */
public class YangHuiTriangle {

    /**
     * 118. 杨辉三角
     *      给定一个非负整数 numRows,生成杨辉三角的前 numRows 行
     *   实例:
     *      输入: 5
     *          输出:
     *              [
     *                  [1],
     *                 [1,1],
     *                [1,2,1],
     *               [1,3,3,1],
     *              [1,4,6,4,1]
     *              ]
     *       解法:
     *          杨辉三角每一层的元素为其上一层当前下表的前一个元素和当前下标元素的和
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 0) {
                list.add(1);
            } else if (i == 1) {
                for (int j = 0; j < 2; j++) {
                    list.add(1);
                }
            } else {
                for (int j = 0; j <= i; j++) {
                    //获取上一层的元素
                    List<Integer> integers = lists.get(i - 1);
                    if (j == 0 || j == i) {
                        list.add(1);
                    } else {
                        Integer integer = integers.get(j - 1);
                        Integer integer1 = integers.get(j);
                        list.add(integer + integer1);
                    }
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
