package com.guod.zoven.algorithm.dataconstructures.queues;

import java.lang.reflect.Array;

public class ArrayQueue<T> implements Queue<T> {
    private Class<T> entityClass;
    private T[] data;

    public ArrayQueue(Class<T> type) {
        this(type, 16);
    }

    public ArrayQueue(Class<T> type, int size) {
        entityClass = type;
        data = (T[])Array.newInstance(type, size);
    }

    /**
     * 入队
     *
     * @param data
     */
    public void enqueue(T data) {

    }

    /**
     * 出队
     */
    public T dequeue() {
        return null;
    }

    /**
     * 队列长度
     */
    public int size() {
        return 0;
    }
}
