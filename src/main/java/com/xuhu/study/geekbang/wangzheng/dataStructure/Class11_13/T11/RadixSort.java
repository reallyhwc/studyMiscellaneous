package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T11;

/**
 * @author xuhu
 * @date 2020-06-15 19:27
 *
 * 基数排序
 * 思路，从前到后对每一位进行计数排序
 *
 */
public class RadixSort {

    /**
     * 同样可以对单词进行排序
     * 这里主要是测试 通过基数排序对10w+的手机号进行排序
     * @param arrays String数组
     * @param length 数组中的词的最大长度
     * @return 排序好的数组
     */
    public static String[] sort(String[] arrays, int length){
        supplementString(arrays,length);
        for (int i = length-1; i >= 0; i--){
            countSortByIndex(arrays,i);
        }
        return arrays;
    }

    private static void countSortByIndex(String[] arrays, int index){
        int[] countSize = new int[128];
        String[] temp = new String[arrays.length];
        for(int i = 0; i < arrays.length; i++){
            temp[i] = arrays[i];
            countSize[arrays[i].charAt(index)]++;
        }
        for (int i = 1; i < 128; i++){
            countSize[i] += countSize[i-1];
        }
        for(int i = arrays.length-1; i >= 0; i--){
            arrays[--countSize[temp[i].charAt(index)]] = temp[i];
        }
    }


    // 给长度不够的字符串前缀补0
    private static void supplementString(String[] arrays, int length){
        for (int index = 0; index < arrays.length; index++){
            if(arrays[index].length() < length){
                arrays[index] = zeroStr(length - arrays[index].length()) + arrays[index];
            }
        }
        System.out.println("前缀补0 结束");
    }

    private static String zeroStr(int size){
        if(size == 0) {
            return "";
        }
        StringBuffer ans = new StringBuffer();
        while (size > 0){
            ans.append(' ');
        }
        return ans.toString();
    }

}
