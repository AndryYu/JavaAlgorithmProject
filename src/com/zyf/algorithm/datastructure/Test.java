package com.zyf.algorithm.datastructure;

public class Test {

    public static void main(String[] args) {
        Array<Integer> array = new Array<>(10);
        for (int i = 0; i <10 ; i++) {
            array.add(i,i);
        }
        System.out.println(array);

        array.add(1,100);
        System.out.println(array);

        array.addFirst(-1);
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.removeElement(4);
        System.out.println(array);

        array.removeFirst();
        System.out.println(array);
    }
}
