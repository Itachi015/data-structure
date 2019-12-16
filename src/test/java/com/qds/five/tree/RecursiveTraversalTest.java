package com.qds.five.tree;

import org.junit.Test;

/**
 * @see RecursiveTraversal
 */
public class RecursiveTraversalTest {

    /**
     * 后序递归遍历
     * @see RecursiveTraversal#postorder(BinTNode)
     */
    @Test
    public void postorder() {

    }

    /**
     * 中序递归遍历
     *
     * @see RecursiveTraversal#inorder(BinTNode)
     */
    @Test
    public void inorder() {
        String table = "(A(B(D,E),C(,F)))";
        BinTNode tree = GenerateBinaryTree.createTree(table);
        RecursiveTraversal.inorder(tree);
    }

    /**
     * 前序递归遍历
     *
     * @see RecursiveTraversal#preorder(BinTNode)
     */
    @Test
    public void preorder() {
        String table = "(A(B(D,E),C(,F)))";
        BinTNode tree = GenerateBinaryTree.createTree(table);
        RecursiveTraversal.preorder(tree);
    }

}
