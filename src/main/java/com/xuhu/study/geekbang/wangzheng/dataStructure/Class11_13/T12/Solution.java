package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T12;

/**
 * @author xuhu
 * @date 2020-06-17 15:14
 * 实现对char数组(仅包含大小写字母)进行排序，小写字母排前大写字母排后(内部不要求有序)
 * 双指针夹逼即可
 */
public class Solution {

    public static char[] sort(char[] chars){
        if(null == chars || chars.length <= 1){
            return chars;
        }
        int i = 0;
        int j = chars.length-1;
        while (i < j){
            if(isSmall(chars[i])){
                i++;
                if(!isSmall(chars[j])){
                    j--;
                }
            }else {
                if (isSmall(chars[j])){
                    swap(chars,i,j);
                    i++;
                    j--;
                }else {
                    j--;
                }
            }
        }
        return chars;
    }

    private static void swap(char[] chars, int i, int j){
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }

    // 返回是否是小写字母
    private static boolean isSmall(char c){
        return c >= 'a' && c <= 'z';
    }
}
