package com.guod.zoven.algorithm.sorts;

/**
 * BubbleSort
 * @date 2020/6/1 下午10:26
 * @author zoven
 */
public class BubbleSort implements Sort<Integer> {


    /**
     * 排序
     *
     * @param data
     */
    @Override
    public Integer[] sort(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            // 确定排序结束条件 -- 不发生交换
            boolean exchange = false;

            //
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    Integer temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;

                    exchange = true;
                }
            }

            if (!exchange) {
                break;
            }
        }
        return data;
    }
}
