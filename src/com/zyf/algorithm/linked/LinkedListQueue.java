package com.zyf.algorithm.linked;

import com.zyf.algorithm.datastructure.Queue;

public class LinkedListQueue<E> implements Queue<E> {

    private Node head, tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())
            throw new IllegalArgumentException("cannot dequeue from an empty queue");

        Node node = head;
        head = node.next;
        node.next = null;

        //head为空  tail也必须为null
        if (head == null)
            tail = null;

        size--;
        return node.e;
    }

    @Override
    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException("cannot getFront from an empty queue");
        return head.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue:front");

        Node cur = head;
        while (cur!=null){
            res.append(cur+"->");
            cur = cur.next;
        }
        res.append("NULL tail");
        return  res.toString();
    }

    private class Node {
        public E e;
        public Node next;

        public Node(E e) {
            this(e, null);
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
