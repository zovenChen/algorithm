package com.guod.zoven.algorithm.dataconstructures.queues;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @Classname CircularQueueTest
 * @Description TODO
 * @Date 2020/5/30 上午8:20
 * @Created by zoven
 */
class CircularQueueTest {

    @Test
    public void testCircularQueue() {
        CircularQueue<Integer> queue = new CircularQueue<Integer>(Integer.class, 8);
        IntStream.range(0, 6).forEach(i -> queue.enqueue(i));

        assertEquals(6, queue.size());

        IntStream.range(0, 2).forEach(i -> System.out.println(queue.dequeue()));
        assertEquals(4, queue.size());

        IntStream.range(6, 12).forEach(i -> queue.enqueue(i));
        assertEquals(8, queue.size());

        IntStream.range(2, 8).forEach(i -> System.out.println(queue.dequeue()));
        assertEquals(2, queue.size());

        while (queue.size() > 0) {
            System.out.println(queue.dequeue());
        }
    }

}