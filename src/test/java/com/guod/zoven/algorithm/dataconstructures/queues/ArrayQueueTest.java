package com.guod.zoven.algorithm.dataconstructures.queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Classname ArrayQueueTest
 * @Description TODO
 * @Date 2020/5/29 上午6:51
 * @Created by zoven
 */
class ArrayQueueTest {

    @Test
    public void testArrayQueue() {
        ArrayQueue<Integer> queue = new ArrayQueue<Integer>(Integer.class, 4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        assertEquals(5, queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        assertEquals(2, queue.size());

        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);

        while (queue.size() > 0) {
            System.out.println(queue.dequeue());
        }
        System.out.println(queue.dequeue());
    }
}