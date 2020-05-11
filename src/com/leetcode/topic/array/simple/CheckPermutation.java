package com.leetcode.topic.array.simple;

import java.util.Arrays;

/**
 * @author 李昭
 * @Date 8:05 2020/5/11
 * @Description:
 * @Modified By:
 */
public class CheckPermutation {

    /**
     * 面试题 01.02. 判定是否互为字符重排
     *      给定两个字符串 s1 和 s2，请编写一个程序,
     *      确定其中一个字符串的字符重新排列后,能否变成另一个字符串
     *  解法:
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < chars1.length; ++i) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}
