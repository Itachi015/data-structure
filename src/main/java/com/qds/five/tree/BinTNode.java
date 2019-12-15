package com.qds.five.tree;

import com.qds.five.stack.DataType;

/**
 * @author kong
 */
public class BinTNode {
    private DataType dataType;
    private BinTNode leftTree;
    private BinTNode rightTree;

    public BinTNode(DataType dataType, BinTNode leftTree, BinTNode rightTree) {
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

    public BinTNode getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(BinTNode leftTree) {
        this.leftTree = leftTree;
    }

    public BinTNode getRightTree() {
        return rightTree;
    }

    public void setRightTree(BinTNode rightTree) {
        this.rightTree = rightTree;
    }
}
