package com.zyf.algorithm.linked.problem;

/**
 * 根据索引位置插入节点
 */
public class Problem5 {

    private ListNode InsertNth(ListNode node, int index, int data) {
        if (node == null)
            throw new NullPointerException("node cannot be null");

        int length = node.length();
        if (index < 0 || index > length) {
            throw new IllegalArgumentException("index not Illegal");
        }
        if (index == 0) {
            node = new ListNode(data,node);
            return node;
        }
        int count = 0;

        ListNode prev = node;
        while (prev != null) {
            if (count == index-1) {
               break;
            }
            count++;
            prev = prev.next;
        }
        ListNode next;
        if (prev != null) {
            next = prev.next;
            prev.next = new ListNode(data,next);
        }
        return node;
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 1, 7, 3, 8, 4, 3, 9};
        ListNode node = new ListNode(data);
        System.out.println(node);

        node = (new Problem5()).InsertNth(node,0,12);
        System.out.println(node);

        node = (new Problem5()).InsertNth(node,4,22);
        System.out.println(node);

        node = (new Problem5()).InsertNth(node,7,19);
        System.out.println(node);

        node = (new Problem5()).InsertNth(node,13,15);
        System.out.println(node);

        node = (new Problem5()).InsertNth(node,15,18);
        System.out.println(node);
    }
}
