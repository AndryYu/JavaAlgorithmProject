package com.zyf.algorithm.linked.problem;

/**
 * 统计某一节点的数量
 */
public class Problem1 {
    public int count(ListNode node, int val){
        int size = 0;

        while (node!=null){
            if (node.val == val)
                size++;

            node = node.next;
        }
        return size;
    }

    public static void main(String[] args) {
        int[] data = {1,3,5,1,7,3,8,4,3,9};
        ListNode node = new ListNode(data);
        System.out.println(node);
        int select = 1;
        int count = (new Problem1()).count(node,select);
        System.out.println("统计"+select+"节点数"+count);

        select = 3;
        int count1 = (new Problem1()).count(node,select);
        System.out.println("统计"+select+"节点数"+count1);

        select = 9;
        int count2 = (new Problem1()).count(node,select);
        System.out.println("统计"+select+"节点数"+count2);
    }
}
