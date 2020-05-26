package com.guod.zoven.algorithm.dataconstructures.stacks;

public interface Stack<T> {
    /**
     * 入栈
     */
    void push(T info);

    /**
     * 出栈
     */
    T pop();

    /**
     *
     */
    T peek();

    boolean isEmpty();
}
