package com.qds.five.tree;

/**
 * @author kong
 */
public class BinaryTreeTraversal {

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
