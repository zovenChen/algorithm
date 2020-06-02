package com.guod.zoven.algorithm.sorts;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


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

        System.out.println(StringUtils.join(data, " "));
    }

    @Test
    void testBubbleSort() {
        System.out.println(StringUtils.join(new BubbleSort().sort(data), " "));
    }

    @Test
    void testInsertionSort() {
        Arrays.stream(new InsertionSort().sort(data)).forEach(System.out::print);
    }

    @Test
    void testInsertionSortWithSentry() {
        System.out.println(StringUtils.join(new InsertionSort().sortWithSentry(data), " "));
    }

    @Test
    void testSelectionSort() {
        System.out.println(StringUtils.join(new SelectionSort().sort(data), " "));
    }
}