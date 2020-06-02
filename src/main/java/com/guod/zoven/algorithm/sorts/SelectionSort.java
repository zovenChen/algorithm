package com.guod.zoven.algorithm.sorts;

/**
 * @Classname SelectionSort
 * @Description TODO
 * @Date 2020/6/3 上午6:48
 * @Auth by zoven
 */
public class SelectionSort implements Sort<Integer> {
    /**
     * 排序
     *
     * @param data
     */
    @Override
    public Integer[] sort(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[index]) {
                    index = j;
                }
            }
            if (index != i) {
                Integer temp = data[index];
                data[index] = data[i];
                data[i] = temp;
            }
        }

        return data;
    }
}
