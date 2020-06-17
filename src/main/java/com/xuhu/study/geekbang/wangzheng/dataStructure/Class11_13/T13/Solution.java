package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T13;

/**
 * @author xuhu
 * @date 2020-06-17 15:41
 * 实现对char数组(包含大小写字母或数字)进行排序，小写字母排前数组中间大写字母最后面(内部不要求有序)
 */
public class Solution {

    public static char[] sort(char[] chars){
        if(chars == null || chars.length <= 1){
            return chars;
        }
        char[] ansChars = new char[chars.length];
        int[] countSize = new int[4];
        for(char c:chars){
            countSize[validateChar(c)]++;
        }

        for (int i = 1; i < countSize.length; i++){
            countSize[i] += countSize[i-1];
        }

        for (int i = 0; i < chars.length; i++){
            ansChars[--countSize[validateChar(chars[i])]] = chars[i];
        }

        return ansChars;
    }

    private static int validateChar(char c){
        if(c >= 'a' && c <= 'z'){
            return 0;
        }
        if(c >= '0' && c <= '9'){
            return 1;
        }
        return 2;
    }

}
