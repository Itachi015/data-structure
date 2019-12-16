package com.qds.three.queue;

import com.qds.five.stack.DataType;

import java.util.Objects;

/**
 * 循环队列
 *
 * @author kong
 */
public class CirQueue<T> {

    private final int queueSize;
    private final DataType<T>[] data;
    private int front;
    private int rear;

    public CirQueue(int queueSize) {
        this.queueSize = queueSize;
        data = new DataType[queueSize];
    }

    /**
     * 出队列
     *
     * @return
     */
    public T deQueue() {
        if (queueEmpty()) {
            throw new RuntimeException("queue empty");
        }
        // 保存待删除元素值
        DataType<T> dataType = data[front];
        // 头指针+1
        front = (front + 1) % queueSize;
        return dataType.getData();
    }

    /**
     * 获取队头元素
     *
     * @return
     */
    public T getFront() {
        if (queueEmpty()) {
            throw new RuntimeException("queue empty");
        }
        return data[front].getData();
    }

    /**
     * 入队列
     *
     * @param data
     */
    public void enQueue(T data) {
        if (queueFull()) {
            throw new RuntimeException("queue overflow");
        }
        this.data[rear] = DataType.create(data);
        rear = (rear + 1) % queueSize;
    }

    /**
     * 判队满
     */
    public boolean queueFull() {
        return (rear + 1) % queueSize == front;
    }


    /**
     * 判队空
     */
    public boolean queueEmpty() {
        return Objects.equals(front, rear);
    }

    /**
     * 置空队列
     */
    public void initQueue() {
        this.front = this.rear = 0;
    }
}
