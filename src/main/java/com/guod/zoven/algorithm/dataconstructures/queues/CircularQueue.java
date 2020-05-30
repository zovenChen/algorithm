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
    private int size;

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
        data = (T[]) Array.newInstance(type, capacity);
    }

    /**
     * 入队
     *
     * @param data
     */
    @Override
    public void enqueue(T data) {
        // 当head为0,tail为数组长度时，则tail + 1 != 0,故得求模
        int next = (tail + 1) % this.data.length;
        if (next == head) {
            System.out.println("队列已满，拒绝入队");
        }

        this.data[next] = data;
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
        head = next;
        return data;
    }

    /**
     * 队列长度
     */
    @Override
    public int size() {
        if (tail < head) {
            return tail + this.data.length - head + 1;
        }
        return tail - head;
    }
}
