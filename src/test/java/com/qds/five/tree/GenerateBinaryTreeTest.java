package com.qds.five.tree;


import org.junit.Test;

/**
 * *************************
 * ****************A********
 * ************B********C***
 * ****************D********
 * ************E********F***
 * *************************
 * <p>
 * A为根结点的树
 * 树的深度为4
 */
public class GenerateBinaryTreeTest {

    /**
     * @see GenerateBinaryTree#createBinTree(String)
     */
    @Test
    public void createBinTree() {
        String table = "ABC@D@@@@EF";
        BinTNode binTree = GenerateBinaryTree.createBinTree(table);
        System.out.println(binTree);
    }

    /**
     * @see GenerateBinaryTree#createTree(String)
     */
    @Test
    public void createTree() {
        String table = "(A(B(,D(E,F)),C))";
        GenerateBinaryTree.createTree(table);
    }
}