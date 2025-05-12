package com.blab.linkedlist;

import java.util.LinkedList;

public class LinkedListMainClass<E extends Comparable> {

    Node head;
    public static void main(String[] args) {
        createSimpleLinkedList();

        // Creating Object to used defined linked list
        LinkedListMainClass linkedListMainClass = new LinkedListMainClass();
        linkedListMainClass.addFromHead(70);
        linkedListMainClass.addFromHead(30);
        linkedListMainClass.addFromHead(56);
        System.out.println(linkedListMainClass);
    }

    // method to perform simple linked list
    public static void createSimpleLinkedList() {
        LinkedList<Integer> list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list);
    }
    // UC1-Creating linked list and adding data from head
    // method to add node to linked list from head
    public void addFromHead(E data)
    {
        Node node = new Node(data);
        Node temp = head;
        this.head = node;
        node.next = temp;
    }

    // method to display datas present in linked list
    @Override
    public String toString()
    {
        // creating temp node to store head
        Node temp = this.head;
        // checking list is empty or not
        if(temp == null) {
            return "list is empty,..";
        }
        // displaying data using loop
        while(temp.next!=null)
        {
            Node node = temp;
            System.out.print(node.data+"-->");
            temp = node.next;
        }
        System.out.println(temp.data);
        return "";
    }
}