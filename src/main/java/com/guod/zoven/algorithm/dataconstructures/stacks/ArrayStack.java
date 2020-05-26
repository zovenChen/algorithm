package com.guod.zoven.algorithm.dataconstructures.stacks;

/**
 * 顺序栈
 */
public class ArrayStack implements Stack<Integer> {
    public static final int DEFAULT_CAPACITY = 2 << 4;
    private Integer[] data;
    /**
     * 数据长度
     */
    private int length;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int size) {
        this.data = new Integer[size];
    }

    /**
     * 入栈
     *
     */
    public void push(Integer info) {
        if (this.length >= this.data.length) {
            // 扩容
            resize();
        }

        this.data[length++] = info;
    }

    /**
     * 出栈
     */
    public Integer pop() {
        if(isEmpty()) {
            return null;
        }

        Integer topItem = this.data[length - 1];
        this.data[length - 1] = null;
        length = length - 1;
        return topItem;
    }

    /**
     *
     */
    public Integer peek() {
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
        Integer[] newSpace = new Integer[this.data.length << 2];
        for (int i = 0; i < this.data.length; i++) {
            newSpace[i] = this.data[i];
        }

        this.data = newSpace;
    }
}
