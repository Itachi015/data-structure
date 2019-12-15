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

    public SeqStack(DataType<T>[] data) {
        this.dataType = data;
        this.top = -1;
    }

    /**
     * 出栈
     *
     * @return
     */
    public DataType<T> pop() {
        if (stackEmpty()) {
            throw new RuntimeException("当前栈为空");
        }
        return this.dataType[top--];
    }

    /**
     * 判栈空
     *
     * @return
     */
    public boolean stackEmpty() {
        return this.top == -1;
    }

    public void addDataType(DataType<T> dataType) {
        this.dataType[++top] = dataType;
    }

    public Integer getTop() {
        return top;
    }

}

