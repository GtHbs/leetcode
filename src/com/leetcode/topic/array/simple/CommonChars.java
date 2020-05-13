package com.leetcode.topic.array.simple;

import java.util.*;

/**
 * @author 李昭
 * @Date 8:03 2020/5/12
 * @Description:
 * @Modified By:
 */
public class CommonChars {

    /**
     * 1002. 查找常用字符
     *       给定仅有小写字母组成的字符串数组 A,
     *       返回列表中的每个字符串中都显示的全部字符(包括重复字符)组成的列表
     *    解法:
     *       1, 暴力法
     *          将第一个字符串的字符存储在数组中,使用另一个数组存储其他字符,每次存储完后进行比较.
     *          查看最小出现次数,赋值给第一个数组,最后只需要返回第一个数组中数量大于0的即可
     *
     * @param A
     * @return
     */
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int[] res = new int[26];
        for (char c : A[0].toCharArray()) {
            res[c - 'a']++;
        }
        for (int i = 1; i < A.length; i++) {
            int[] temp = new int[26];
            for (char c : A[i].toCharArray()) {
                temp[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                res[j] = Math.min(res[j], temp[j]);
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] > 0) {
                for (int j = 0; j < res[i]; j++) {
                    list.add(((char) ('a' + i) + ""));
                }
            }
        }
        return list;
    }
}
