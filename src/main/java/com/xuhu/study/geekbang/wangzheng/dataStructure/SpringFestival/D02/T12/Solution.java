package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T12;


import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        int[] ans = new int[n - k + 1];
        ans[0] = nums[deque.peekFirst()];
        for (int i = k; i < n; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            ans[i - k + 1] = nums[deque.peekFirst()];
        }
        return ans;
    }

    public int[] maxSlidingWindow01(int[] nums, int k) {
        // 使用队列维护 需要注意的是，并不需要通过大顶堆的remove方法来每次都要移除对应的数据，而是，数据在堆顶且过期再删除，利用一点空间换一下时间
        int len = nums.length;
        PriorityQueue<int[]> queue = new PriorityQueue<>((t1, t2)-> t2[0] != t1[0] ? t2[0] - t1[0] : t2[1] - t1[1]);
        for (int i = 0; i < k; i++) {
            queue.offer(new int[]{nums[i],i});
        }
        int[] ans = new int[len - k + 1];
        ans[0] = queue.peek()[0];
        for (int i = k; i < len; i++){
            queue.offer(new int[] {nums[i], i});
            while (queue.peek()[1] <= (i - k)){
                queue.poll();
            }
            ans[i - k + 1] = queue.peek()[0];
        }
        return ans;
    }
}