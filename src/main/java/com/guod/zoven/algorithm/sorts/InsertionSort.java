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
     * @param data
     */
    @Override
    public Integer[] sort(Integer[] data) {
        for (int i = 1; i < data.length; i++) {
            int value = data[i];
            for (int j = i - 1; j >= 0; j--) {
                if(value < data[j]) {
                    data[j + 1] = data[j];
                } else {
                    data[j] = value;
                    break;
                }
            }
        }

        return data;
    }
}
