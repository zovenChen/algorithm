package com.guod.zoven.algorithm.dataconstructures.queues;

public interface Queue<T> {
    /**
     * 入队
     */
    void enqueue(T data);

    /**
     * 出队
     */
    T dequeue();

    /**
     * 队列长度
     */
    int size();
}
