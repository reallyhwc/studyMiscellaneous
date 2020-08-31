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
     * @param value 待新增值
     */
    public void addTreeNode(int value){
        if (node == null){
            // 如果二叉搜索树为空 则作为根节点
            node = new TreeNode(value);
        }else {
            TreeNode temp = node;
            while (temp != null){
                // 循环的往下去匹配，思路不难，看代码理解吧
                if (temp.val > value){
                    if (temp.left != null){
                        temp = temp.left;
                    }else {
                        temp.left = new TreeNode(value);
                        return;
                    }
                }else if (temp.val < value) {
                    if (temp.right != null) {
                        temp = temp.right;
                    }else {
                        temp.right = new TreeNode(value);
                        return;
                    }
                }else {
                    if (temp.right == null){
                        temp.right = new TreeNode(value);
                        return;
                    }else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

    /**
     *
     * @param value
     * @return
     */
    public boolean searchTreeNode(int value){
        TreeNode temp = node;
        while (temp != null) {
            if (temp.val == value){
                return true;
            }else if (temp.val > value){
                if (temp.left != null){
                    temp = temp.left;
                }else {
                    return false;
                }
            }else {
                if (temp.right != null){
                    temp = temp.right;
                }else {
                    return false;
                }
            }
        }
        return false;
    }

    public void showTree(){
        TreeOperation.show(this.node);
    }
}
