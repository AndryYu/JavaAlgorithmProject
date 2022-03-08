package com.zyf.algorithm.linked.problem;

/**
 * 根据索引返回链表中对应的节点
 */
public class Problem2 {
    public int GetNth(ListNode node,int index){
        if (node==null){
            throw new NullPointerException("head cannot be null");
        }
        int length = node.length();
        if (index<0||index>=length){
            throw new IllegalArgumentException("index not Illegal");
        }
        int count = 0;
        while (node!=null){
            if (count==index){
                return node.val;
            }
            count++;
            node = node.next;
        }
        return -1;
    }

    public int GetNthOwn(ListNode node,int index){
        if (node==null){
            throw new NullPointerException("head cannot be null");
        }
        int length = node.length();
        if (index<0||index>=length){
            throw new IllegalArgumentException("index not Illegal");
        }
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public static void main(String[] args) {
        int[] data = {1,3,5,1,7,3,8,4,3,9};
        ListNode node = new ListNode(data);
        System.out.println(node);

        int select = 1;
        int count = (new Problem2()).GetNth(node,select);
        System.out.println("链表"+select+"位置数"+count);

        select = 3;
        int count2 = (new Problem2()).GetNthOwn(node,select);
        System.out.println("链表"+select+"位置数"+count2);

        select = 7;
        int count3 = (new Problem2()).GetNth(node,select);
        System.out.println("链表"+select+"位置数"+count3);
    }
}
