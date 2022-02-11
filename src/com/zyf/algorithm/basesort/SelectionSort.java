package com.zyf.algorithm.basesort;


import com.zyf.algorithm.test.ArrayGenerator;
import com.zyf.algorithm.test.SortingHelper;

import java.util.Arrays;

public class SelectionSort {

    /**
     * 自己写的
     * @param data  int数组
     */
    public static void sortByMe(int[] data){
        for (int i = 0; i <data.length ; i++) {
            for (int j=i;j<data.length;j++){
                if (data[j] < data[i]) {
                    int swap = data[j];
                    data[j]=data[i];
                    data[i]=swap;
                }
            }
        }
    }

    /**
     * 2.教程里面int数组排序方法
     * @param data int数组
     */
    public static void sort(int[] data){
        //data[0...i)是有序的；data[i...n)是无序的
        for (int i = 0; i <data.length ; i++) {
            int minIndex = i;
            //选择 arr[i...n)中的最小值的索引
            for (int j=i;j<data.length;j++){
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            swap(data,i, minIndex);
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 3.使用泛型
     * @param data 泛型数组
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] data){
        //data[0...i)是有序的；data[i...n)是无序的
        for (int i = 0; i <data.length ; i++) {
            int minIndex = i;
            //选择 arr[i...n)中的最小值的索引
            for (int j=i;j<data.length;j++){
                //前者小于后者返回负数，大于返回正数，等于返回0
                if (data[j].compareTo(data[minIndex])<0) {
                    minIndex = j;
                }
            }
            swap(data,i, minIndex);
        }
    }
    private static <E> void swap(E[] arr,int i,int j){
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] data = {12,3,6,2,9,24,4};
        SelectionSort.sortByMe(data);
        System.out.println("个人方法data调整后顺序="+ Arrays.toString(data));

        //int数组
        SelectionSort.sort(data);
        System.out.println("data调整后顺序="+ Arrays.toString(data));

        //泛型
        Integer[] data1 = {12,3,6,2,9,24,4,23};
        SelectionSort.sort(data1);
        System.out.println("泛型data调整后顺序="+ Arrays.toString(data1));

        //自定义对象
        Student[] students = {
                new Student("Alice",97),
                new Student("Bobo",77),
                new Student("Charles",85)
        };
        SelectionSort.sort(students);
        System.out.println("自定义对象student调整后顺序="+ Arrays.toString(students));

        //4.生成數組
        int[] dataSize = {10000, 100000};
        for (int n:dataSize) {
            Integer[] data4 = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.SortedTest("SelectionSort",data4);
        }

    }
}
