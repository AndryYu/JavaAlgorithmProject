package com.zyf.algorithm.test;

import com.zyf.algorithm.basesort.SelectionSort;

public class SortingHelper {

    public static <E extends Comparable<E>> boolean isSorted(E[] arr){
        for (int i = 1;i<arr.length;i++){
            if (arr[i-1].compareTo(arr[i])>0){
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<E>> void SortedTest(String sortName, E[] arr){
        long start = System.nanoTime();
        if ("SelectionSort".equals(sortName))
            SelectionSort.sort(arr);
        long end = System.nanoTime();
        System.out.println(sortName+",n="+arr.length+",runs=" + (end - start) / 1000000000.0 + "s");

        if (!SortingHelper.isSorted(arr)){
            throw new RuntimeException("排序异常");
        }
    }
}
