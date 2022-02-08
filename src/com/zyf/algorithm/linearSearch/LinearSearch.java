package com.zyf.algorithm.linearSearch;

public class LinearSearch {

    /**
     * 简单线性查找法
     * @param data  数组对象
     * @param target  查找对象
     * @return
     */
    public static int search(int[] data, int target){
        for (int i = 0 ; i<data.length;i++){
            if (data[i]==target)
                return i;
        }
        return -1;
    }

    /**
     * 泛型 简单线性查找
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E> int search(E[]data, E target){
        for (int i = 0 ; i<data.length;i++){
            if (data[i].equals(target))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        //1， int 线性查找
        int[] data = {24,18,12,9,16,66,32,4};
        int res = LinearSearch.search(data, 16);
        System.out.println(res);

        //2， 泛型 线性查找
        Integer[] data2 = {24,18,12,9,16,66,32,4};
        int res2 = LinearSearch.<Integer>search(data2, 19);
        System.out.println(res2);
    }
}
