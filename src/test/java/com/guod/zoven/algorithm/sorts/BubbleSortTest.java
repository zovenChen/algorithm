package com.guod.zoven.algorithm.sorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Classname BubbleSortTest
 * @Description TODO
 * @Date 2020/6/1 下午10:43
 * @Auth by zoven
 */
class BubbleSortTest {

    @Test
    void sort() {
        Integer[] data = new Integer[] {
            5, 8, 2, 4, 20, 13, 8, 9,6
        };
        Arrays.stream(new BubbleSort().sort(data)).forEach((i) -> System.out.println(i));
    }
}