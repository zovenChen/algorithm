package com.guod.zoven.algorithm.dataconstructures.queues;

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

    public int getSize() {
        return size;
    }

    public LinkQueue() {
        front = new Node<T>(null);
        rear = front;
    }

    /**
     * 入队
     *
     * @param data
     */
    public void enqueue(T data) {
        rear.next = new Node<T>(data);
        rear = rear.next;
        size++;
    }

    /**
     * 出队
     */
    public T dequeue() {
        Node<T> oldFront = front;
        front = front.next;
        size--;

        oldFront.next = null;
        return oldFront.data;
    }
}
