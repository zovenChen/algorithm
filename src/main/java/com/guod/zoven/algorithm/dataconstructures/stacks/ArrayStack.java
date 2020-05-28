package com.guod.zoven.algorithm.dataconstructures.stacks;

import java.lang.reflect.Array;

/**
 * 顺序栈
 */
public class ArrayStack<T> implements Stack<T> {
    public static final int DEFAULT_CAPACITY = 2 << 4;
    private Class<T> entityClass;
    private T[] data;
    /**
     * 数据长度
     */
    private int length;

    public ArrayStack(Class<T> type) {
        this(type, DEFAULT_CAPACITY);
    }

    public ArrayStack(Class<T> type,int size) {
        this.entityClass = type;
        this.data = (T[]) Array.newInstance(type,size);
    }

    /**
     * 入栈
     *
     */
    public void push(T info) {
        if (this.length >= this.data.length) {
            // 扩容
            resize();
        }

        this.data[length++] = info;
    }

    /**
     * 出栈
     */
    public T pop() {
        if(isEmpty()) {
            return null;
        }

        T topItem = this.data[length - 1];
        this.data[length - 1] = null;
        length = length - 1;
        return topItem;
    }

    /**
     *
     */
    public T peek() {
        if(isEmpty()) {
            return null;
        }

        return this.data[length - 1];
    }

    public boolean isEmpty() {
        return 0 == length;
    }

    /**
     * 扩容
     */
    private void resize() {
        T[] newSpace = (T[]) Array.newInstance(entityClass,this.data.length << 1);
//        for (int i = 0; i < this.data.length; i++) {
//            newSpace[i] = this.data[i];
//        }
        System.arraycopy(this.data, 0, newSpace, 0, this.data.length);

        this.data = newSpace;
    }
}
