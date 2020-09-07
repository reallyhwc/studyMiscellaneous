package com.xuhu.study.geekbang.wangzheng.dataStructure.Class24.T01;

import com.xuhu.study.Utils.TreeNode;
import com.xuhu.study.Utils.TreeOperation;

/**
 * @author xuhu
 * @date 2020-08-31 17:39
 */
public class BinarySearchTree {

    private TreeNode node;

    public BinarySearchTree() {
        node = null;
    }

    /**
     * 新增结点
     *
     * @param value 待新增值
     */
    public void addTreeNode(int value) {
        if (node == null) {
            // 如果二叉搜索树为空 则作为根节点
            node = new TreeNode(value);
            return;
        }

        TreeNode temp = node;
        while (temp != null) {
            // 循环的往下去匹配，思路不难，看代码理解吧
            if (temp.val > value) {
                if (temp.left == null) {
                    temp.left = new TreeNode(value);
                    return;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = new TreeNode(value);
                    return;
                }
                temp = temp.right;
            }
        }
    }

    /**
     * 查找结点
     *
     * @param value 待查找值
     * @return 存在返回结点 不存在返回null
     */
    public TreeNode searchTreeNode(int value) {
        TreeNode temp = node;
        while (temp != null) {
            if (temp.val == value) {
                return temp;
            } else if (temp.val > value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return null;
    }

    /**
     * 删除结点
     * 首先找到待删除结点 以及待删除结点的pre结点
     *
     * @param value 待删除结点
     */
    public void deleteTreeNode(int value) {
        TreeNode pre = null;
        TreeNode waitDelete = node;
        while (waitDelete != null && waitDelete.val != value) {
            pre = waitDelete;
            if (value > waitDelete.val) {
                waitDelete = waitDelete.right;
            } else {
                waitDelete = waitDelete.left;
            }
        }
        if (waitDelete == null) {
            // 说明没有找到
            return;
        }
        // 要删除的节点有两个子节点
        if (waitDelete.left != null && waitDelete.right != null) { // 查找右子树中最小节点
            TreeNode minP = waitDelete.right;
            TreeNode minPP = waitDelete; // minPP表示minP的父节点
            while (minP.left != null) {
                minPP = minP;
                minP = minP.left;
            }
            waitDelete.val = minP.val; // 将minP的数据替换到p中
            waitDelete = minP; // 下面就变成了删除minP了
            pre = minPP;
        }

        // 删除节点是叶子节点或者仅有一个子节点
        TreeNode child; // p的子节点
        if (waitDelete.left != null) {
            child = waitDelete.left;
        } else if (waitDelete.right != null) {
            child = waitDelete.right;
        } else {
            child = null;
        }

        if (pre == null) {
            node = child; // 删除的是根节点
        } else if (pre.left == waitDelete) {
            pre.left = child;
        } else {
            pre.right = child;
        }
    }

    public void showTree() {
        TreeOperation.show(this.node);
    }
}
