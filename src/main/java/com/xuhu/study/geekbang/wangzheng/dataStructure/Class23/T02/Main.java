package com.xuhu.study.geekbang.wangzheng.dataStructure.Class23.T02;

import com.xuhu.study.Utils.TreeNode;
import com.xuhu.study.Utils.TreeOperation;
import com.xuhu.study.Utils.TreeUtils;

/**
 * @author xuhu
 * @date 2020-08-30 20:43
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node = TreeUtils.create(new Integer[]{1, 2, 3, 4, 5, 6, 7}, 0);
        TreeOperation.show(node);
        System.out.println();
        solution.printTree(node);
    }
}
