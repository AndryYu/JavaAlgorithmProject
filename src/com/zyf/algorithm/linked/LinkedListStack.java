package com.zyf.algorithm.linked;

import com.zyf.algorithm.datastructure.Stack;

public class LinkedListStack<E> implements Stack<E> {

    LinkedListDummyHead<E> linkedList;

    public LinkedListStack() {
        linkedList =new LinkedListDummyHead<>();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return "LinkedListStack{" +
                "linkedList=" + linkedList +
                '}';
    }
}
