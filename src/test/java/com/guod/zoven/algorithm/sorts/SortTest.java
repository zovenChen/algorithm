package com.guod.zoven.algorithm.sorts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Classname BubbleSortTest
 * @Description TODO
 * @Date 2020/6/1 下午10:43
 * @Auth by zoven
 */
class SortTest {
    Integer[] data;

    @BeforeEach
    void initData() {
        data = new Integer[] {
                5, 8, 2, 4, 20, 13, 8, 9,6
        };
    }

    @Test
    void testBubbleSort() {
        Arrays.stream(new BubbleSort().sort(data)).forEach(System.out::println);
    }

    @Test
    void testInsertionSort() {
        Arrays.stream(new InsertionSort().sort(data)).forEach(System.out::println);
    }
}