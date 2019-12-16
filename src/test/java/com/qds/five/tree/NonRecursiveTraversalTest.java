package com.qds.five.tree;

import org.junit.Test;

/**
 * @see NonRecursiveTraversal
 */
public class NonRecursiveTraversalTest {

    /**
     * @see NonRecursiveTraversal#transLevel(BinTNode)
     */
    @Test
    public void transLevel() {
        BinTNode tree = getTree1();
        NonRecursiveTraversal.transLevel(tree);
    }

    /**
     * 通过广义表生成树
     *
     * @return
     */
    public BinTNode getTree1() {
        String table = "(A(B(D,E),C(,F)))";
        BinTNode tree = GenerateBinaryTree.createTree(table);
        return tree;
    }

    @Test
    public void preorder() {
        String table = "(A(B(D,E),C(,F)))";
        BinTNode tree = GenerateBinaryTree.createTree(table);
        NonRecursiveTraversal.preorder(tree);
    }

    /**
     * @see NonRecursiveTraversal#inorder2(BinTNode)
     */
    @Test
    public void inorder2() {
        String table = "(A(B(D,E),C(,F)))";
        BinTNode tree = GenerateBinaryTree.createTree(table);
        NonRecursiveTraversal.inorder2(tree);
    }

    /**
     * @see NonRecursiveTraversal#inorder1(BinTNode)
     */
    @Test
    public void inorder1() {
        String table = "(A(B(D,E),C(,F)))";
        BinTNode tree = GenerateBinaryTree.createTree(table);
        NonRecursiveTraversal.inorder1(tree);
    }
}
