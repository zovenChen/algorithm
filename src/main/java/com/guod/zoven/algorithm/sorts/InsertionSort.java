package com.guod.zoven.algorithm.sorts;

/**
 * @Classname InsertionSort
 * @Description TODO
 * @Date 2020/6/2 上午6:02
 * @Author by zoven
 */
public class InsertionSort implements Sort<Integer> {
    /**
     * 排序
     *
     * 将数组中的数据分为两个区间，已排序区间和未排序区间。
     * 初始已排序区间只有一个元素，就是数组的第一个元素。
     * 插入算法的核心思想是取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入，
     * 并保证已排序区间数据一直有序。重复这个过程，直到未排序区间中元素为空，算法结束
     * @param data
     */
    @Override
    public Integer[] sort(Integer[] data) {
        for (int i = 1; i < data.length; i++) {
            int value = data[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if(value < data[j]) {
                    data[j + 1] = data[j];
                } else {
                    break;
                }
            }
            data[j + 1] = value;
        }

        return data;
    }

    /**
     * 采用哨兵模式
     *
     * 问题：数据第一项去哪了？
     */
    public Integer[] sortWithSentry(Integer[] data) {
        for (int i = 2; i < data.length; i++) {
            if(data[i] < data[i -1]) {
                // 设置哨兵
                data[0] = data[i];

                int j = i - 1;
                for (; j >= 0; j--) {
                    if (data[0] < data[j]) {
                        data[j + 1] = data[j];
                    } else {
                        break;
                    }
                }

                data[j+1] = data[0];
            }
        }
        return data;
    }
}
