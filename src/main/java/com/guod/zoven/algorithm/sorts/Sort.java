package com.guod.zoven.algorithm.sorts;

/**
 * @Classname Sort
 * @Description TODO
 * @Date 2020/6/1 下午10:29
 * @Author by zoven
 */
public interface Sort<T extends Comparable<T> > {

    /**
     * 排序
     */
    T[] sort(T[] data);
}
