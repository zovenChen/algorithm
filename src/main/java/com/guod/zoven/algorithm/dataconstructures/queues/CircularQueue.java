package com.guod.zoven.algorithm.dataconstructures.queues;

import java.lang.reflect.Array;

/**
 * @Classname CircularQueue
 * @Description TODO
 * @Date 2020/5/29 上午6:20
 * @author zoven
 */
public class CircularQueue<T> implements Queue<T> {
    private Class<T> entityClass;
    private T[] data;

    /**
     * 队头下标
     */
    private int head;
    /**
     * 队尾下标
     */
    private int tail;

    public CircularQueue(Class<T> type) {
        this(type, 16);
    }

    public CircularQueue(Class<T> type, int capacity) {
        entityClass = type;
        data = (T[]) Array.newInstance(type, capacity + 1);
    }

    /**
     * 入队
     *
     * tail 指向为null元素(即队满时，留一空元素)，原因为更好判断队满
     */
    @Override
    public void enqueue(T data) {
        // 当head为0,tail为数组长度时，则tail + 1 != 0,故得求模
        int next = (tail + 1) % this.data.length;
        if (next == head) {
            System.out.println("队列已满，拒绝入队");
            return;
        }

        this.data[tail] = data;
        tail = next;
    }

    /**
     * 出队
     */
    @Override
    public T dequeue() {
        int next = (head + 1) % this.data.length;
        if (next == head) {
            return null;
        }
        T data = this.data[head];
        this.data[head] = null;
        head = next;
        return data;
    }

    /**
     * 队列长度
     */
    @Override
    public int size() {
        if (tail < head) {
            return tail + this.data.length - head;
        }
        return tail - head;
    }
}
