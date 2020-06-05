package com.xuhu.study.geekbang.wangzheng.dataStructure.Class07.T04;


import com.xuhu.study.Utils.ListNodeUtil;
import com.xuhu.study.Utils.SystemOutUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNodeUtil.printListNode(solution.removeNthFromEnd(ListNodeUtil.convertArrayToListNode(new int[]{1,2,3,4,5}),1));
        SystemOutUtil.Separate();
        ListNodeUtil.printListNode(solution.removeNthFromEnd(ListNodeUtil.convertArrayToListNode(new int[]{1,2,3,4,5}),2));
        SystemOutUtil.Separate();
        ListNodeUtil.printListNode(solution.removeNthFromEnd(ListNodeUtil.convertArrayToListNode(new int[]{1}),1));
    }
}