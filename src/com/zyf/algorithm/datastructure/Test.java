package com.zyf.algorithm.datastructure;

import java.util.Random;

public class Test {

    //数组测试
    /*public static void main(String[] args) {
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
    }*/

    //栈测试
    /*public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }*/

    //队列测试
    /*public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();

        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);

        queue.enqueue(5);
        System.out.println(queue);
    }*/

    //循环队列测试
    /*public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue);

        queue.enqueue(42);
        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);

        queue.enqueue(12);
        System.out.println(queue);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }*/

    //测试使用q运行opCount个enqueue和dequeue操作时间
    private static double testQueue(Queue<Integer> q,int opCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime-startTime)/1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 100000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue,opCount);
        System.out.println("ArrayQueue, time:"+time1+"s");

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue,opCount);
        System.out.println("LoopQueue, time:"+time2+"s");
    }
}
