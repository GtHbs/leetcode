package com.leetcode.topic.array.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 李昭
 * @Date 8:02 2020/4/26
 * @Description:
 * @Modified By:
 */
public class IsUnique {

    /**
     * 面试题 01.01. 判定字符是否唯一
     *  实现一个算法,确定一个字符串 s 的所有字符是否全都不同
     * 解法:
     *    1, 暴力法
     *      将字符串转为数组,存入到set中,查看set的长度和字符串长度是否相等,如果相等,则不存在重复字符
     *      否则存在
     * @param astr
     * @return
     */
    public boolean isUnique(String astr) {
        Set<Character> characters = new HashSet<>();
        char[] chars = astr.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            characters.add(chars[i]);
        }
        return characters.size() == chars.length;
    }
}
