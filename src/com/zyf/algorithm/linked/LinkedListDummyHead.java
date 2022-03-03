package com.zyf.algorithm.linked;

public class LinkedListDummyHead<E> {

    //虚拟链头
    private Node dummyHead;
    int size;

    public LinkedListDummyHead() {
        //初始化虚拟链头
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表头添加数据
     *
     * @param e
     */
    public void addFirst(E e) {
       add(0,e);
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed, Illegal index");
        }

        /*--待删除之前的node--*/
        Node prev = dummyHead;
        for (int i = 0; i < index ; i++) {
            prev = prev.next;
        }
        /* -----*/

        Node next = prev.next;
        prev.next = new Node(e, next);
        size++;
    }

    public void addLast(E e) {
        add(size, e);
    }

    public E get(int index){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add failed, Illegal index");
        }

        /*--待删除的node--*/
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        /* -----*/

        return cur.e;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size-1);
    }

    public void set(int index, E e){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add failed, Illegal index");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    //查找链表中是否有元素e
    public boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur != null){
            if (cur.e.equals(e)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public E remove(int index){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add failed, Illegal index");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;

        return retNode.e;
    }

    public E  removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size-1);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur!=null){
            res.append(cur+"->");
            cur = cur.next;
        }
        res.append("NULL");
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
