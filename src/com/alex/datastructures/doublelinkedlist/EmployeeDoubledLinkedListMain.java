package com.alex.datastructures.doublelinkedlist;

import com.alex.datastructures.Employee;

public class EmployeeDoubledLinkedListMain {

    public static void main(String[] args) {
        EmployeeDoubledLinkedList doubledLinkedList = new EmployeeDoubledLinkedList();
        doubledLinkedList.addToFront(new Employee("jane", 2));
        doubledLinkedList.addToFront(new Employee("jansae", 2));
        doubledLinkedList.addToEnd(new Employee("janasde", 2));
        doubledLinkedList.printList();
        doubledLinkedList.removeFromEnd();
        doubledLinkedList.removeFromFront();
        doubledLinkedList.printList();
    }
}
