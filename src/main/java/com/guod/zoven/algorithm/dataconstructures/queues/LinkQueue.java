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

    private Node<T> front;
    private Node<T> rear;
    private int size;
    private Class<T> entityClass;

    public LinkQueue() {

    }

    /**
     * 入队
     *
     * @param data
     */
    public void enqueue(T data) {
        if (front == null) {
            front = new Node<T>(data);
            rear = front;
        } else {
            rear.next = new Node<T>(data);
            rear = rear.next;
        }
        size++;
    }

    /**
     * 出队
     */
    public T dequeue() {
        if (front == null) {
            return null;
        }
        Node<T> oldFront = front;
        front = front.next;
        size--;

        oldFront.next = null;
        return oldFront.data;
    }

    /**
     * 队列长度
     */
    public int size() {
        return size;
    }
}
