package com.qds.five.tree;

import org.junit.Test;

/**
 * @see NonRecursiveTraversal
 */
public class NonRecursiveTraversalTest {

    /**
     * @see NonRecursiveTraversal#transLevel(BinTree)
     */
    @Test
    public void transLevel() {
        BinTree tree = getTree1();
        NonRecursiveTraversal.transLevel(tree);
    }

    /**
     * 通过广义表生成树
     *
     * @return
     */
    public BinTree getTree1() {
        String table = "(A(B(D,E),C(,F)))";
        BinTree tree = GenerateBinaryTree.createTree(table);
        return tree;
    }

    @Test
    public void preorder() {
        String table = "(A(B(D,E),C(,F)))";
        BinTree tree = GenerateBinaryTree.createTree(table);
        NonRecursiveTraversal.preorder(tree);
    }

    /**
     * @see NonRecursiveTraversal#inorder2(BinTree)
     */
    @Test
    public void inorder2() {
        String table = "(A(B(D,E),C(,F)))";
        BinTree tree = GenerateBinaryTree.createTree(table);
        NonRecursiveTraversal.inorder2(tree);
    }

    /**
     * @see NonRecursiveTraversal#inorder1(BinTree)
     */
    @Test
    public void inorder1() {
        String table = "(A(B(D,E),C(,F)))";
        BinTree tree = GenerateBinaryTree.createTree(table);
        NonRecursiveTraversal.inorder1(tree);
    }
}
