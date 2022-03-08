package com.zyf.algorithm.linked.problem;

/**
 * 将节点插入有序链表
 */
public class Problem6 {

    public ListNode SortedInsert(ListNode node, int data) {
        if (node == null)
            throw new NullPointerException("ListNode cannot be null");

        ListNode head = node;
        if (head.val > data) {
            node = new ListNode(data,node);
            return node;
        }
        ListNode selectNode = node;
        while (true) {
            ListNode next = selectNode.next;
            System.out.println("循环体next"+next);
            if (next != null) {
                if (next.val > data) {
                    break;
                }
                selectNode = next;
            }else{
                break;
            }
        }

        selectNode.next = new ListNode(data, selectNode.next);
        return node;
    }

    public static void main(String[] args) {
        int[] data = {2, 3, 5, 7, 8, 9};
        ListNode node = new ListNode(data);
        System.out.println(node);

        node = (new Problem6()).SortedInsert(node, 1);
        System.out.println(node);

        node = (new Problem6()).SortedInsert(node, 4);
        System.out.println(node);

        node = (new Problem6()).SortedInsert(node, 11);
        System.out.println(node);
    }
}
