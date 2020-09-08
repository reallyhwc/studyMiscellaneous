package com.xuhu.study.geekbang.wangzheng.dataStructure.Class24.T05_06;

import com.xuhu.study.Utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xuhu
 * @date 2020-09-08 9:41
 *
 * 求二叉树的深度
 */
public class Solution {

    public int treeDeep(TreeNode node){
        if (node == null){
            return 0;
        }
        return Math.max(treeDeep(node.left),treeDeep(node.right)) + 1;
    }

    public int treeDeep02(TreeNode node){
        if (node == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        int ans = 0;
        queue.add(node);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tempNode = queue.poll();
                if (tempNode.left != null){
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null){
                    queue.add(tempNode.right);
                }
            }
            ans++;
        }
        return ans;
    }
}
