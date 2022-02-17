package com.zyf.algorithm.basesort;

import com.zyf.algorithm.test.ArrayGenerator;
import com.zyf.algorithm.test.SortingHelper;

import java.util.Arrays;

public class InsertionSort {

    /**
     * 2.教程里面int数组排序方法
     *
     * @param data int数组
     */
    public static void sort(int[] data) {
        //data[0...i)是有序的；data[i...n)是无序的
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                if (data[j - 1] > data[j]) {
                    swap(data, j - 1, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 3.使用泛型
     *
     * @param data 泛型数组
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] data) {
        //data[0...i)是有序的；data[i...n)是无序的
        for (int i = 1; i < data.length; i++) {
            //选择 arr[i...n)中的最小值的索引
            for (int j = i; j-1 >= 0; j--) {
                //前者小于后者返回负数，大于返回正数，等于返回0
                if (data[j-1].compareTo(data[j]) > 0) {
                    swap(data, j-1, j);
                }
            }
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static <E extends Comparable<E>> void sortOptimize(E[] data) {
        //data[0...i)是有序的；data[i...n)是无序的
        for (int i = 1; i < data.length; i++) {
            E t = data[i];
            int j;
            //选择 arr[i...n)中的最小值的索引
            for (j = i; j-1 >= 0 && t.compareTo(data[j-1])<0; j--) {
                //前者小于后者返回负数，大于返回正数，等于返回0
                data[j]=data[j-1];
            }
            data[j] = t;
        }
    }

    public static void main(String[] args) {
        int[] data = {12, 3, 6, 2, 9, 24, 4};
        InsertionSort.sort(data);
        System.out.println("个人方法data调整后顺序=" + Arrays.toString(data));


        //泛型
        Integer[] data1 = {74, 71, 97, 7, 95, 61, 40, 36, 10, 22, 47, 2, 68, 12, 8, 12, 22, 94, 91, 28, 16};
        InsertionSort.sort(data1);
        System.out.println("泛型data调整后顺序=" + Arrays.toString(data1));


        //4.生成數組
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] data4 = ArrayGenerator.generateRandomArray(n, n);
            Integer[] data5 = Arrays.copyOf(data4,data4.length);
            SortingHelper.SortedTest("InsertionSort", data4);
            SortingHelper.SortedTest("InsertionSortOpt", data5);
        }
    }
}
