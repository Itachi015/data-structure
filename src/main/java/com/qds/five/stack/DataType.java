package com.qds.five.stack;

/**
 * 二叉树数据
 *
 * @author kong
 */
public class DataType<T> {

    private T data;

   private DataType(T data) {
       this.data = data;
   }

    public static <R> DataType<R> create(R ch) {
        return new DataType<>(ch);
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "DataType{" +
            "data=" + data +
            '}';
    }
}
