package com.guod.zoven.algorithm.dataconstructures.queues;

/**
 * @classname LinkQueue
 * @author zoven
 */
public class LinkQueue<T> implements Queue<T> {

    public class Node<T> {
        public Node(T data) {
            this.data = data;
        }

        T data;
        Node<T> next;
    }

    /**
     * 队头
     */
    private Node<T> head;
    /**
     * 队尾
     */
    private Node<T> tail;
    private int size;
    private Class<T> entityClass;

    public LinkQueue() {

    }

    /**
     * 入队
     *
     * @param data
     */
    @Override
    public void enqueue(T data) {
        if (head == null) {
            head = new Node<T>(data);
            tail = head;
        } else {
            tail.next = new Node<T>(data);
            tail = tail.next;
        }
        size++;
    }

    /**
     * 出队
     */
    @Override
    public T dequeue() {
        if (head == null) {
            return null;
        }
        Node<T> oldFront = head;
        head = head.next;
        size--;

        oldFront.next = null;
        return oldFront.data;
    }

    /**
     * 队列长度
     */
    @Override
    public int size() {
        return size;
    }
}
