package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 * @Date 7:47 2020/4/24
 * @Description:
 * @Modified By:
 */
public class FlipAndInvertImage {

    /**
     * 832. 翻转图像
     * 给定一个二进制矩阵 A,我们想先水平翻转图像,然后反转图像并返回结果。
     *  水平翻转图片就是将图片的每一行都进行翻转,即逆序.
     *  例如,水平翻转 [1, 1, 0] 的结果是 [0, 1, 1].
     *  反转图片的意思是图片中的 0 全部被 1 替换,1 全部被 0 替换.
     *  例如,反转 [0, 1, 1] 的结果是 [1, 0, 0]
     * 解法:
     *      1, 暴力法
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; ++i) {
            invertAndFlip(A[i]);
        }
        return A;
    }

    public void invertAndFlip(int[] arr) {
        //1, flip
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        //2, reverse
        int temp;
        for (int i = 0,j = arr.length - 1; i < j; ++i,--j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
