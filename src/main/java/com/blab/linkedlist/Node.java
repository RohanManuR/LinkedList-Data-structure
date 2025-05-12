package com.blab.linkedlist;

public class Node <E extends Comparable>{
    E data;
    Node<E> next;
    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}
