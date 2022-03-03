package com.zyf.algorithm.linked;

public class LinkedList<E> {

    private Node head;
    //private Node dummyHead;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    /**
     * 在链表头添加数据
     * @param e
     */
    public void addFirst(E e){
        //新加入的都是链首，head开始先是上一次记录node,最后赋值成最新的node
       /* Node node = new Node(e);
        node.next = head;
        head = node;*/

        head = new Node(e,head);
        size++;
    }

    public void add(int index,E e){
        if (index<0||index>size){
            throw new IllegalArgumentException("Add failed, Illegal index");
        }
        if (index==0){
            addFirst(e);
        }else{
            Node prev = head;
            for (int i = 0; i < index-1; i++) {
                prev = prev.next;
            }
            Node next = prev.next;
            prev.next = new Node(e,next);
            size++;
        }
    }

    public void addLast(E e){
        add(size,e);
    }


    private class Node{
        public E e;
        public Node next;

        public Node(E e) {
            this(e,null);
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "e=" + e +
                    ", next=" + next +
                    '}';
        }
    }
}
