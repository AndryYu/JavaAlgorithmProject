package com.zyf.algorithm.linked.problem;

/**
 * 删除链表
 */
public class Problem3 {

    public void deleteList(ListNode node) {
        if (node == null)
            return;
        ListNode next;
        while (node != null) {
            next = node.next;
            //通过对next赋值null来回收
            node.next = null;
            node = null;
            node = next;
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 1, 7, 3, 8, 4, 3, 9};
        ListNode node = new ListNode(data);
        System.out.println(node);

        (new Problem3()).deleteList(node);
        System.out.println(node);
    }
}
