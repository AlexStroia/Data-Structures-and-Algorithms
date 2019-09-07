package com.alex.datastructures.singlelinkedlist;

import com.alex.datastructures.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;

    public void addToFront(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;
    }

    public void printList() {
        EmployeeNode current = head;
        while (current.getNext() != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public EmployeeNode removeFromList() {
        EmployeeNode currentHead = head;
        head = head.getNext();
        return currentHead;
    }

    public Boolean isEmpty() {
        return head == null;
    }
}
