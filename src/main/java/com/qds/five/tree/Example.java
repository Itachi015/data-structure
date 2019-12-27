package com.qds.five.tree;

/**
 * 习题
 * @author kong
 */
public class Example {

    /**
     * 例5.3 计算链式二叉树深度
     * @param tree
     * @return
     */
    public static int binTreeDepth(BinTree tree) {
        if (tree == null) {
            return 0;
        }
        // 左子树的深度
        int depl = binTreeDepth(tree.getLeftTree());
        // 右子树的深度
        int depr = binTreeDepth(tree.getRightTree());
        if (depl > depr) {
            return depl + 1;
        } else {
            return depr + 1;
        }
    }

}
