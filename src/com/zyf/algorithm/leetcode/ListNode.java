package com.zyf.algorithm.leetcode;


public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(int[] arr){
        if (arr==null||arr.length == 0)
            throw  new IllegalArgumentException("arr can not be empty");

        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ListNode: ["+ this.val);
        ListNode node = this;
        while (node.next!=null){
            builder.append("->"+node.next.val);
            node = node.next;
        }
        builder.append("]");
        return builder.toString();
    }
}
