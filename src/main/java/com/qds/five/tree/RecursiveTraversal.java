package com.qds.five.tree;

/**
 * 二叉树的递归遍历
 *
 * @author kong
 */
public class RecursiveTraversal {

    /**
     * 后序递归遍历
     *
     * @param node
     */
    public static void postorder(BinTNode node) {
        if (node != null) {
            inorder(node.getLeftTree());
            inorder(node.getRightTree());
            System.out.println(node.getDataType());
        }
    }

    /**
     * 中序递归遍历
     *
     * @param node
     */
    public static void inorder(BinTNode node) {
        if (node != null) {
            inorder(node.getLeftTree());
            System.out.println(node.getDataType());
            inorder(node.getRightTree());
        }
    }

    /**
     * 先序遍历
     *
     * @param node
     */
    public static void preorder(BinTNode node) {
        if (node != null) {
            System.out.println(node.getDataType());
            BinTNode leftTree = node.getLeftTree();
            BinTNode rightTree = node.getRightTree();
            preorder(leftTree);
            preorder(rightTree);
        }
    }

}
