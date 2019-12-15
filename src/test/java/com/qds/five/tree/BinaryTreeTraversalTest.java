package com.qds.five.tree;

import org.junit.Test;

public class BinaryTreeTraversalTest {

    /**
     * 后序递归遍历
     * @see BinaryTreeTraversal#postorder(BinTNode)
     */
    @Test
    public void postorder() {

    }

    /**
     * 中序递归遍历
     *
     * @see BinaryTreeTraversal#inorder(BinTNode)
     */
    @Test
    public void inorder() {
        String table = "(A(B(D,E),C(,F)))";
        BinTNode tree = GenerateBinaryTree.createTree(table);
        BinaryTreeTraversal.inorder(tree);
    }

    /**
     * 前序递归遍历
     *
     * @see BinaryTreeTraversal#preorder(BinTNode)
     */
    @Test
    public void preorder() {
        String table = "(A(B(D,E),C(,F)))";
        BinTNode tree = GenerateBinaryTree.createTree(table);
        BinaryTreeTraversal.preorder(tree);
    }

}
