package com.zyf.algorithm.leetcode;

public class SolutionRemove {
    public ListNode removeElements(ListNode head, int val,int depth){
        String depthString = generateDepthString(depth);

        System.out.print(depthString);
        System.out.println("Call:remove "+val+" in "+head);
        if (head == null){
            System.out.print(depthString);
            System.out.println("Return: "+head);
            return null;
        }


        ListNode res = removeElements(head.next,val,depth+1);
        System.out.print(depthString);
        System.out.println("After remove "+val+" in "+res);

        ListNode ret;
        if (head.val ==val){
            ret = res;
        }else{
            head.next= res;
            ret = head;
        }
        System.out.print(depthString);
        System.out.println("Return "+res);
        return ret;
    }

    private String generateDepthString(int depth){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("--");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        int[] sums = {1,2,6,3,4,5,6};
        ListNode head = new ListNode(sums);
        System.out.println(head);

        ListNode res = (new SolutionRemove()).removeElements(head,6,0);
        System.out.println(res);
    }
}
