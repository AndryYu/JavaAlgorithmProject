package com.zyf.algorithm.linked.problem;

/**
 * 删除首节点
 */
public class Problem4 {

    public int pop(ListNode node){
        if (node==null)
            throw new NullPointerException("node cannot be null");

        int ret;
        ListNode head = node.next;

        ret = node.val;
        //将node的值和next 赋值成下一个节点
        node.val=head.val;
        node.next = head.next;
        return ret;
    }

    public static void main(String[] args) {
        int[] data = {1,3,5,1,7,3,8,4,3,9};
        ListNode node = new ListNode(data);
        System.out.println(node);

        int ret1 = (new Problem4()).pop(node);
        System.out.println("移除元素："+ret1);
        System.out.println(node);

        int ret2 = (new Problem4()).pop(node);
        System.out.println("移除元素："+ret2);
        System.out.println(node);
    }
}
