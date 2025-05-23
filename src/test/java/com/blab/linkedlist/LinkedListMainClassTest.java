package com.blab.linkedlist;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListMainClassTest {

    static LinkedListMainClass list;

    // method to execute before all the test cases
    @BeforeAll
    public static void setUp()
    {
        list = new LinkedListMainClass();
        list.addFromHead(10.25);
        list.addFromHead(20.20);
        list.addFromHead(10.10);
    }

    // method check testcases - search element in list
    @Test
    void search() {
        assertTrue(list.search(10.25),"Value 10.25 should be found");
    }

    // method to check testcases - insert element based on element
    @Test
    void insertAtPosition() {
        assertTrue(list.insertAtPosition(70.00,10.10),"Value 10.10 should be inserted");
    }

    @Test
    void deleteValue() {
        assertTrue(list.delete(20.20),"Value 20.20 should be deleted");
    }

}