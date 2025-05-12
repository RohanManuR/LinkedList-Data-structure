package com.blab.linkedlist;

import java.util.LinkedList;

public class LinkedListMainClass<E extends Comparable> {

    Node head;
    public static void main(String[] args) {
        createSimpleLinkedList();

        // Creating Object to used defined linked list
        LinkedListMainClass list = new LinkedListMainClass();
        // adding the data from head
        list.addFromHead(70);
        list.addFromHead(30);
        list.addFromHead(56);
        // adding the data from tail
        list.addFromTail(56);
        list.addFromTail(30);
        list.addFromTail(70);
        // printing ref var to display elements
        System.out.println(list);
        // adding data to inbetween
        list.insertMid(80);
        // removing first element
        list.pop();
        System.out.println(list);
    }

    // method to perform simple linked list
    public static void createSimpleLinkedList() {
        LinkedList<Integer> list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list);
    }
    // UC2-Creating linked list and adding data from head
    // method to add node to linked list from head
    public boolean addFromHead(E data)
    {
        // node object created
        Node node = new Node(data);
        Node temp = head;
        this.head = node;
        node.next = temp;
        return true;
    }

    // UC3-Adding the data from tail side
    // method to add nodes from tail side to linked list
    public  boolean addFromTail(E data)
    {
        // node object created
        Node node = new Node<>(data);
        // checking that is head is empty or not
        if(this.head == null) {
            this.head = node;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        return true;
    }

    // UC4-Insert node inbetween
    // creted a method to insert the node in between the nodes
    public boolean insertMid(E data)
    {
        // checking that is head is empty or not
        if(head == null) {
            System.out.println("list is empty");
            return false;
        }
        // node object created
        Node node = new Node(data);
        Node temp = head;
        // traversing upto half of linked list
        for(int i=1;i<this.size()/2;i++)
        {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        return true;
    }

    // UC5 - Delete the first element in linked list
    // method to delete the first node (pop)
    public boolean pop()
    {
        // checking that is head is empty or not
        if(head == null) {
            System.out.println("list is empty");
            return false;
        }
        // to delete the first element
        Node temp = head;
        this.head = head.next;
        System.out.println("removed element : "+temp.data);
        return true;
    }

    // method to diplay the size the linked list
    public int size()
    {
        // checking the list is empty or not
        if(head==null)
            return 0;
        // variable to count size
        int size = 0;
        Node temp = this.head;
        // loop to traverse the nodes
        while(temp.next!=null)
        {
            size++;
            temp = temp.next;
        }
        return ++size;
    }

    // Override toString method to display data's present in linked list
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