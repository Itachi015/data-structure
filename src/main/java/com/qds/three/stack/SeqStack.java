package com.qds.three.stack;

import com.qds.five.stack.DataType;

/**
 * @author kong
 */
public class SeqStack<T> {

    /**
     * 存放表结点
     */
    private DataType<T>[] dataType;
    /**
     * 栈顶指针
     */
    private Integer top;

    /**
     * 栈的大小
     */
    private Integer stackSize;

    public SeqStack(Integer stackSize) {
        this.stackSize = stackSize;
        dataType = new DataType[stackSize];
    }

    public void push(T t) {
        if (stackFull()) {
            throw new RuntimeException("stack overflow");
        }
        // 压栈并栈顶指针+1
        dataType[++top] = DataType.create(t);
    }

    public boolean stackFull() {
        return top.equals(stackSize - 1);
    }

    /**
     * 置空栈
     */
    public void initStack() {
        top = -1;
    }

    /**
     * 出栈
     *
     * @return
     */
    public T pop() {
        if (stackEmpty()) {
            throw new RuntimeException("当前栈为空");
        }
        return this.dataType[top--].getData();
    }

    /**
     * 判栈空
     *
     * @return
     */
    public boolean stackEmpty() {
        return this.top == -1;
    }

    /**
     * 取栈顶元素
     *
     * @return
     */
    public T getTop() {
        if (stackEmpty()) {
            throw new RuntimeException("stack empty");
        }
        return dataType[top].getData();
    }

}

