package com.qds.five.tree;

import com.qds.three.queue.CirQueue;
import com.qds.three.stack.SeqStack;

/**
 * 二叉树的非递归遍历
 *
 * @author kong
 */
public class NonRecursiveTraversal {

    /**
     * 非递归层次遍历二叉树
     *
     * @param node
     */
    public static void transLevel(BinTree node) {
        CirQueue<BinTree> queue = new CirQueue<>(32);
        queue.initQueue();
        System.out.println(node.getDataType());
        queue.enQueue(node);
        while (!queue.queueEmpty()) {
            node = queue.deQueue();
            if (node.getLeftTree() != null) {
                System.out.println(node.getLeftTree().getDataType());
                queue.enQueue(node.getLeftTree());
            }
            if (node.getRightTree() != null) {
                System.out.println(node.getRightTree().getDataType());
                queue.enQueue(node.getRightTree().getRightTree());
            }
        }
    }

    /**
     * 栈的前序递归遍历二叉树
     */
    public static void preorder(BinTree node) {
        SeqStack<BinTree> stack = new SeqStack<>(32);
        stack.initStack();
        stack.push(node);
        BinTree p;
        while (!stack.stackEmpty()) {
            p = stack.pop();
            if (p != null) {
                System.out.println(p.getDataType());
                stack.push(p.getRightTree());
                stack.push(p.getLeftTree());
            }
        }

    }

    /**
     * 指针数组递归中序遍历二叉链表算法
     *
     * @param node
     */
    public static void inorder2(BinTree node) {
        BinTree[] array = new BinTree[32];
        int top = 0;
        array[top] = node;
        BinTree leftTree;
        do {
            while (array[top] != null) {
                leftTree = array[top].getLeftTree();
                array[++top] = leftTree;
            }
            --top;
            if (top > -1) {
                System.out.println(array[top].getDataType());
                array[top] = array[top].getRightTree();
            }
        } while (top != -1);
    }

    /**
     * 栈的非递归中序遍历二叉链表算法
     *
     * @param node
     */
    public static void inorder1(BinTree node) {
        SeqStack<BinTree> seqStack = new SeqStack<>(32);
        seqStack.initStack();
        seqStack.push(node);
        BinTree p;

        while (!seqStack.stackEmpty()) {
            while (seqStack.getTop() != null) {
                // 直到左子树为空为止
                seqStack.push(seqStack.getTop().getLeftTree());
            }
            // 空指针退栈
            p = seqStack.pop();
            if (!seqStack.stackEmpty()) {
                // 打印根节点
                System.out.println(seqStack.getTop().getDataType());
                // 右子树进栈
                p = seqStack.pop();
                seqStack.push(p.getRightTree());
            }
        }

    }


}
