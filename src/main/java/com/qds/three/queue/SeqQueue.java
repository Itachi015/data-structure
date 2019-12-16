package com.qds.three.queue;

import com.qds.five.stack.DataType;

/**
 * 顺序队列
 *
 * @author kong
 */
public class SeqQueue<T> {

    private final int queueSize;
    private DataType<T>[] dataType;
    /**
     * 队头
     */
    private int front;
    /**
     * 队尾
     */
    private int rear;

    public SeqQueue(int queueSize) {
        this.queueSize = queueSize;
        dataType = new DataType[queueSize];
    }
}
