package com.guod.zoven.algorithm.sorts;

import com.sun.istack.internal.NotNull;
import org.apache.commons.lang3.StringUtils;

/**
 * @Classname QuickSort
 * @Description TODO
 * @Date 2020/6/3 下午10:45
 * @Author by zoven
 */
public class QuickSort implements Sort<Integer> {
    /**
     * 排序
     *
     * @param data
     */
    @Override
    public Integer[] sort(@NotNull Integer[] data) {
        partition(data, 0, data.length - 1);
        return data;
    }

    private void partition(Integer[] data, int left, int right) {
        if (left >= right) {
            return;
        }
        System.out.println(StringUtils.join(data, " ") + " left: "+ String.valueOf(left) +",right: " + String.valueOf(right));

        int i = left;
        int j = right;
        while (i < j) {

            while (i < j && data[i] <= data[j]) {
                j--;
            }

            if (i < j) {
                int temp = data[j];
                data[j] = data[i];
                data[i] = temp;
                i++;
            }

            while (i < j && data[i] <= data[j]) {
                i++;
            }

            if (i < j) {
                int temp = data[j];
                data[j] = data[i];
                data[i] = temp;
                j--;
            }
        }

        partition(data, left, i - 1);
        partition(data, i + 1, right);
    }
}
