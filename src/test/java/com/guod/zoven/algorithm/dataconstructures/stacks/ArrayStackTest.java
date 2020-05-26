package com.guod.zoven.algorithm.dataconstructures.stacks;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayStackTest {

    ArrayStack arrayStack;

    @Test
    void arrayStackTest() {
        // Declare a stack of maximum size 4
        ArrayStack arrayStack = new ArrayStack(4);

        // Populate the stack
        arrayStack.push(5);
        arrayStack.push(8);
        arrayStack.push(2);
        arrayStack.push(9);

        System.out.println("*********************Stack Array Implementation*********************");
        System.out.println(arrayStack.isEmpty()); // will print false
//        System.out.println(arrayStack.isFull()); // will print true
        System.out.println(arrayStack.peek()); // will print 9
        System.out.println(arrayStack.pop()); // will print 9
        System.out.println(arrayStack.peek()); // will print 2
    }

}