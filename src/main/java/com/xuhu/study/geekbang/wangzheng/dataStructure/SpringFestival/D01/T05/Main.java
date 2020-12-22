package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T05;

import com.xuhu.study.Utils.ListNodeUtil;
import com.xuhu.study.Utils.ListUtils;

/**
 * @author xuhu
 * @date 2020-12-22 19:59
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNodeUtil.printListNode(solution.reverse(ListNodeUtil.createListNode(new Integer[]{1,2})));
    }
}
