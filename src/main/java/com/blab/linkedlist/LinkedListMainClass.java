package com.blab.linkedlist;

import java.util.LinkedList;

public class LinkedListMainClass {
    public static void main(String[] args) {
        createSimpleLinkedList();
    }

    public static void createSimpleLinkedList() {
        LinkedList<Integer> list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list);
    }

}