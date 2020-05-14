package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 * @Date 8:07 2020/5/14
 * @Description:
 * @Modified By:
 */
public class OnlyOneNumber {

    /**
     * 136. 只出现一次的数字
     *      给定一个非空整数数组,除了某个元素只出现一次以外,
     *      其余每个元素均出现两次.找出那个只出现了一次的元素.
     *      说明:
     *          你的算法应该具有线性时间复杂度.
     *          你可以不使用额外空间来实现吗?
     *      解法:
     *          1, 暴力法
     *             因为题目要求不使用额外的空间,所以可以使用双重循环进行判断
     *          2, 使用位运算符
     *             异或:相同为0,不同为1.
     *             因为异或满足交换律,所以两个相同的数字进行异或运算结果为0,而0与任何数字进行
     *             异或运算,结果都为任意数,所以最后只会返回单独的那一个数字,
     *             因为本题重复数字只出现两次所以可以使用异或,但是如果出现奇数次则该方法行不通,
     *             需要使用其他方法,例如hash,排序...
     *             [4,1,2,1,2]
     *             以该数组为例
     *             0 ^= 4 = 4 ^= 1 = 5 ^ 2 = 7 ^ 1 = 6 ^ 2 = 4
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if ((i != j) && (nums[i] == nums[j])) {
//                    count++;
//                }
//            }
//            if (count == 0) {
//                return nums[i];
//            }
//        }
//        return -1;
        int res = 0;
        for(int i:nums){
            res ^= i;
        }
        // 最后返回是落单的
        return res;
    }

}
