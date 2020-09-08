package com.xuhu.study.geekbang.wangzheng.dataStructure.Class24.T05_06;

import com.xuhu.study.Utils.TreeNode;
import com.xuhu.study.Utils.TreeOperation;
import com.xuhu.study.Utils.TreeUtils;

/**
 * @author xuhu
 * @date 2020-09-08 9:49
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node = TreeUtils.create(new Integer[]{1,2,3,4,5,null,null,8,null,10},0);
        TreeOperation.show(node);

        System.out.println(solution.treeDeep(node));
        System.out.println(solution.treeDeep02(node));
    }
}
