package com.xuhu.study.geekbang.wangzheng.dataStructure.Class27.T01;

import java.util.List;

/**
 * @author xuhu
 * @date 2020-09-10 18:39
 */
public class Solution {

    /*
    第一层分解有 n 次交换操作，第二层有 n 个节点，每个节点分解需要 n−1 次交换，所以第二层总的交换次数是 n∗(n−1)。
    第三层有 n∗(n−1) 个节点，每个节点分解需要 n−2 次交换，所以第三层总的交换次数是 n∗(n−1)∗(n−2)。
    以此类推，第 k 层总的交换次数就是 n∗(n−1)∗(n−2)∗…∗(n−k+1)。
    最后一层的交换次数就是 n∗(n−1)∗(n−2)∗…∗2∗1。每一层的交换次数之和就是总的交换次数。
    这个公式的求和比较复杂，我们看最后一个数，n∗(n−1)∗(n−2)∗…∗2∗1 等于 n!，
    而前面的 n−1 个数都小于最后一个数，所以，总和肯定小于 n∗n!，
    也就是说，全排列的递归算法的时间复杂度大于 O(n!)，小于 O(n∗n!)，
    虽然我们没法知道非常精确的时间复杂度，但是这样一个范围已经让我们知道，全排列的时间复杂度是非常高的。
     */

    public void fullArray(int[] nums, int k, int n){
        if (k == 1){
            printArray(nums);
            return;
        }
        for (int i = 0; i < k; i++){
            swap(nums,i,k-1);
            fullArray(nums,k-1,n);
            swap(nums,i,k-1);
        }
    }

    private void printArray(int[] nums){
        for (int num : nums){
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    private void swap(int[] nums, int m,int n){
        int target = nums[m];
        nums[m] = nums[n];
        nums[n] = target;
    }
}
