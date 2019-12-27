package com.qds.five.tree;

import com.qds.five.stack.DataType;

/**
 * @author kong
 */
public class BinTree {
    private DataType dataType;
    private BinTree leftTree;
    private BinTree rightTree;

    public BinTree(DataType dataType, BinTree leftTree, BinTree rightTree) {
        this.dataType = dataType;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public BinTree getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(BinTree leftTree) {
        this.leftTree = leftTree;
    }

    public BinTree getRightTree() {
        return rightTree;
    }

    public void setRightTree(BinTree rightTree) {
        this.rightTree = rightTree;
    }
}
