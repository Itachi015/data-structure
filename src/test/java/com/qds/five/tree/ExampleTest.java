package com.qds.five.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {

    /**
     * 计算链式二叉树深度
     * @see Example#binTreeDepth(BinTree)
     */
    @Test
    public void binTreeDepth() {
        String table = "(A(B(,D(E,F)),C))";
        BinTree tree = GenerateBinaryTree.createTree(table);
        System.out.println(Example.binTreeDepth(tree));
    }
}