package com.leetcode.topic.array.simple;

import java.util.*;

/**
 * @author 李昭
 * @Date 8:22 2020/4/28
 * @Description:
 * @Modified By:
 */
public class ArraySplit {

    /**
     * 561. 数组拆分 I
     *      给定长度为2n的数组,你的任务是将这些数分成n对,
     *      例如(a1,b1),(a2,b2),...,(an,bn),使得从1到n的min(ai,bi)总和最大.
     *   实例:
     *      输入: [1,4,3,2]
     *      输出: 4
     *      过程: n = 2,最大总和为4 = min(1,2) + min(3,4)
     *   解法:
     *      将数组进行排序,暴力破解
     *
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            list.add(nums[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int count = 0;
        for (int i = 0; i < list.size(); i += 2) {
            count += list.get(i);
        }
        return count;
    }

    public int arraySplit(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            count += nums[i];
        }
        return count;
    }
}
