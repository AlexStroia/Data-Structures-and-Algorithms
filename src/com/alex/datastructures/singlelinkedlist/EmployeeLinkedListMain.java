package com.alex.datastructures.singlelinkedlist;

import com.alex.datastructures.Employee;

public class EmployeeLinkedListMain {

    public static void main(String[] args) {
        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        employeeLinkedList.addToFront(new Employee("jane", 2));
        employeeLinkedList.addToFront(new Employee("jansae", 2));
        employeeLinkedList.addToFront(new Employee("janasde", 2));
        employeeLinkedList.addToFront(new Employee("jaasdasne", 2));
        employeeLinkedList.addToFront(new Employee("jsadane", 2));

        employeeLinkedList.printList();
        employeeLinkedList.removeFromList();
        employeeLinkedList.removeFromList();

        System.out.println(employeeLinkedList.isEmpty());
        employeeLinkedList.printList();
    }
}
