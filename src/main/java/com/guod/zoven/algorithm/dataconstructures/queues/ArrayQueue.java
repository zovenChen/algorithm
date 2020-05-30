package com.guod.zoven.algorithm.dataconstructures.queues;

import java.lang.reflect.Array;

/**
 * ArrayQueue
 * @param <T> T
 * @author zoven
 */
public class ArrayQueue<T> implements Queue<T> {
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

    public ArrayQueue(Class<T> type) {
        this(type, 16);
    }

    public ArrayQueue(Class<T> type, int capacity) {
        entityClass = type;
        data = (T[])Array.newInstance(type, capacity);
    }

    /**
     * 入队
     *
     * @param data
     */
    @Override
    public void enqueue(T data) {
        if (tail == this.data.length) {
            // 数据长度小于容量，进行数据搬移，否则扩容
            if (size() + 1 < this.data.length) {
                this.dataMove();
            } else {
                this.resize();
            }
        }

        this.data[tail++] = data;
    }


    /**
     * 出队
     */
    @Override
    public T dequeue() {
        if (size() == 0) {
            return null;
        }
        return this.data[head++];
    }

    /**
     * 队列长度
     */
    @Override
    public int size() {
        return tail - head;
    }

    /**
     * 数据搬迁
     */
    private void dataMove() {
        for (int i = 0; i < tail - head; i++) {
            this.data[i] = this.data[head + i];
            this.data[head + i] = null;
        }
        tail = tail - head;
        head = 0;
    }

    private void resize() {
        T[] newSpace = (T[]) Array.newInstance(entityClass,this.data.length << 1);
        System.arraycopy(this.data, 0, newSpace, 0, this.data.length);

        this.data = newSpace;
    }
}
