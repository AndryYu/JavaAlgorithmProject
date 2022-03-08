package com.zyf.algorithm.leetcode;

import java.util.Stack;

/**
 * 回文链表
 */
public class SolutionPalindrome {

    public boolean isPalindrome(ListNode head) {
        StringBuilder builder = new StringBuilder();

        ListNode node = head;
        while (node != null) {
            builder.append(node.val);
            node = node.next;
        }

        System.out.println("链表数据=" + builder.toString());
        return isTestPalindrome(builder.toString());
    }

    public boolean isTestPalindrome(String data) {
        if (data.length()==1){
            return true;
        }

        String prev, latter;
        if (data.length()%2==0) {
            prev = data.substring(0, data.length() / 2);
           latter = data.substring(data.length() / 2);
        }else{
            prev = data.substring(0, (data.length()-1) / 2);
           latter = data.substring((data.length()+1) / 2);
        }

        String revLatter = new StringBuilder(latter).reverse().toString();

        return prev.equals(revLatter);
    }


    public static void main(String[] args) {
        //ListNode node = new SolutionPalindrome().addNode(1);

        int[] data = {1,2,3,4,3,2,1};
        ListNode node = new ListNode(data);
        System.out.println(node);

        boolean isPalindrome = new SolutionPalindrome().isPalindrome(node);
        System.out.println(node + "运行结果：" + isPalindrome);

        ListNode node1 = new ListNode(2);
        boolean isPalindrome1 = new SolutionPalindrome().isPalindrome(node1);
        System.out.println(node1 + "运行结果：" + isPalindrome1);
    }

    boolean isOk;

    private ListNode addNode(int data) {
        System.out.println("addNode data=" + data);
        if (data == 0) {
            return null;
        }
        if (data == 4) {
            isOk = true;
        }
        if (isOk)
            return new ListNode(data, addNode(--data));
        else
            return new ListNode(data, addNode(++data));

    }

}
