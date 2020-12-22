package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T03;

/**
 * @author xuhu
 * @date 2020-12-21 19:51
 * 实现两个有序数组合并为一个有序数组
 */
public class Solution {

    public int[] merge(int[] nums1, int[] nums2){
        if (nums1 == null || nums1.length == 0){
            return nums2;
        }
        if (nums2 == null || nums2.length == 0){
            return nums1;
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        int[] ans = new int[len1+len2];

        for (int i = 0; i < len1 + len2; i++) {
            if (index1 >= len1 || nums2[index2] <= nums1[index1]){
                ans[i] = nums2[index2++];
            }else {
                ans[i] = nums1[index1++];
            }
        }
        return ans;
    }
}
