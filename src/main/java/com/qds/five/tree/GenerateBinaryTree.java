package com.qds.five.tree;

import com.qds.five.stack.DataType;

/**
 * 生成二叉树
 *
 * @author kong
 */
public class GenerateBinaryTree {

    /**
     * 完全二叉树生成二茬链表
     * <p>
     * 从上到下，从左到右
     * <p>
     * eg. A B C @ D  @  @  D  E  F
     *
     * @return
     */
    public static BinTree createBinTree(String table) {
        int length = table.length();
        BinTree root = null;
        // 队列
        BinTree[] queue = new BinTree[64];
        // 新生成结点
        BinTree node;
        // 双亲结点下标
        int front = 1;
        // 当前结点
        int rear = 0;
        char ch;
        for (int i = 0; i < length; i++) {
            node = null;
            ch = table.charAt(i);
            if (ch != '@') {
                node = new BinTree(DataType.create(ch), null, null);
            }
            // 队尾指针+1 并加入队列
            queue[++rear] = node;
            // 如果队尾指针为1, 则为树根
            if (rear == 1) {
                root = node;
            } else {
                // 当前节点和其双亲结点都不为虚结点
                if (node != null &&  queue[front] != null) {
                    // rear为偶数 新结点应为右孩子
                    if (rear % 2 == 0) {
                        queue[front].setLeftTree(node);
                    } else {
                        queue[front].setRightTree(node);
                    }
                }

                // rear为奇数 则front指向下一个双亲
                 if (rear % 2 != 0) {
                     ++front;
                 }
            }
        }
        return root;
    }

    /**
     * 通过广义表生成二叉链表
     * eg. (A(B(,D(E,F)),C))
     *
     * @param table 广义表
     * @return 二叉树
     */
    public static BinTree createTree(String table) {
        // 广义表长度
        int length = table.length();
        // 栈的深度
        BinTree[] stack = new BinTree[length];
        BinTree tree = null;
        int top = -1;
        int type = 0;
        BinTree root = null;
        char ch;
        for (int i = 0; i < length; i++) {
            ch = table.charAt(i);
            switch (ch) {
                case '(':
                    stack[++top] = tree;
                    type = 1;
                    break;
                case ')':
                    stack[top--] = null;
                    break;
                case ',':
                    type = 2;
                    break;
                default:
                    tree = new BinTree(DataType.create(ch), null, null);
                    if (root == null) {
                        root = tree;
                    } else {
                        switch (type) {
                            case 1:
                                stack[top].setLeftTree(tree);
                                break;
                            case 2:
                                stack[top].setRightTree(tree);
                                break;
                            default:
                                System.out.println("异常类型");
                        }
                    }

            }

        }
        return root;
    }


}
