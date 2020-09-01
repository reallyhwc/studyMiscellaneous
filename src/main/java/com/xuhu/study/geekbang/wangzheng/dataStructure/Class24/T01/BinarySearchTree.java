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
            return;
        }

        TreeNode temp = node;
        while (temp != null){
            // 循环的往下去匹配，思路不难，看代码理解吧
            if (temp.val > value){
                if (temp.left == null){
                    temp.left = new TreeNode(value);
                    return;
                }
                temp = temp.left;
            }else{
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
     * @param value 待查找值
     * @return 存在返回结点 不存在返回null
     */
    public TreeNode searchTreeNode(int value){
        TreeNode temp = node;
        while (temp != null) {
            if (temp.val == value){
                return temp;
            }else if (temp.val > value){
                temp = temp.left;
            }else {
                temp = temp.right;
            }
        }
        return null;
    }

    /**
     * 删除结点
     * 首先找到待删除结点 以及待删除结点的pre结点
     * @param value 待删除结点
     */
    public void deleteTreeNode(int value){
//        TreeNode pre = null;
//        TreeNode waitDelete = node;
//        while (waitDelete != null) {
//            if (waitDelete.val == value){
//                break;
//            }else if (waitDelete.val > value){
//                if (waitDelete.left != null){
//                    pre = waitDelete;
//                    waitDelete = waitDelete.left;
//                }else {
//                    return;
//                }
//            }else {
//                if (waitDelete.right != null){
//                    pre = waitDelete;
//                    waitDelete = waitDelete.right;
//                }else {
//                    return;
//                }
//            }
//        }
//        // 走到这里 如果没有返回  说明已经找到了
//        if (waitDelete.val == value){
//            // 寻找一个结点 替换当前节点
//            if (waitDelete.right == null){
//
//            }
//        }
//        return;
    }

    public void showTree(){
        TreeOperation.show(this.node);
    }
}
