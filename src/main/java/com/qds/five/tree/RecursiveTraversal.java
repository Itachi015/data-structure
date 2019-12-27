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
    public static void postorder(BinTree node) {
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
    public static void inorder(BinTree node) {
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
    public static void preorder(BinTree node) {
        if (node != null) {
            System.out.println(node.getDataType());
            BinTree leftTree = node.getLeftTree();
            BinTree rightTree = node.getRightTree();
            preorder(leftTree);
            preorder(rightTree);
        }
    }

}
