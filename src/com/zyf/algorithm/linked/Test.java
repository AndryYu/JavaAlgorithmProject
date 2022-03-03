package com.zyf.algorithm.linked;

import com.zyf.algorithm.datastructure.*;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        //链表
        /*LinkedListDummyHead<Integer> linkedList = new LinkedListDummyHead<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
        }
        System.out.println(linkedList);

        linkedList.add(2,666);
        System.out.println(linkedList);

        linkedList.remove(2);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);*/

        //链表栈
        /*LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);*/

        //链表栈和数组栈对比
        /*int opCount = 100000;
        ArrayStack<Integer> arrayQueue = new ArrayStack<>();
        double time1 = testStack(arrayQueue,opCount);
        System.out.println("ArrayStack, time:"+time1+"s");

        LinkedListStack<Integer> loopQueue = new LinkedListStack<>();
        double time2 = testStack(loopQueue,opCount);
        System.out.println("LinkedListStack, time:"+time2+"s");*/

        //链表队列
        LinkedListQueue<Integer> stack = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            stack.enqueue(i);
            System.out.println(stack);
            if (i%3==2){
                stack.dequeue();
                System.out.println(stack);
            }
        }
    }

    private static double testStack(Stack<Integer> q, int opCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.pop();
        }
        long endTime = System.nanoTime();
        return (endTime-startTime)/1000000000.0;
    }
}
