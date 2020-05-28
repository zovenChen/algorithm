package com.guod.zoven.algorithm.dataconstructures.queues;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/** 
* LinkQueue Tester. 
* 
* @author <Authors name> 
* @since <pre>5月 28, 2020</pre> 
* @version 1.0 
*/ 
public class LinkQueueTest {

/** 
* 
* Method: enqueue(T data) 
* 
*/ 
@Test
public void testQueue() throws Exception {
    LinkQueue<Integer> linkQueue = new LinkQueue<Integer>();
    linkQueue.enqueue(1);
    linkQueue.enqueue(2);
    linkQueue.enqueue(3);
    linkQueue.enqueue(4);
    linkQueue.enqueue(5);

    assertEquals(5, linkQueue.size());
    while (linkQueue.size() > 0) {
        System.out.println(linkQueue.dequeue());
    }
} 
}
