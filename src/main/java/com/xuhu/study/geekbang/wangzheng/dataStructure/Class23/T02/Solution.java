package com.xuhu.study.geekbang.wangzheng.dataStructure.Class23.T02;

import com.xuhu.study.Utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xuhu
 * @date 2020-08-30 20:37
 * 层序遍历二叉树实现！
 */
public class Solution {

    public void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                System.out.print(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            System.out.println();
        }
    }

}
