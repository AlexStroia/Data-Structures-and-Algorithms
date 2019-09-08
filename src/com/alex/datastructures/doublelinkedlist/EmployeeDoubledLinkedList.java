package com.alex.datastructures.doublelinkedlist;

import com.alex.datastructures.Employee;

public class EmployeeDoubledLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);

        if (tail == null) {
            head = employeeNode;
        } else {
            tail.setNext(employeeNode);
            employeeNode.setPrevious(tail);
        }
        tail = employeeNode;
    }

    public EmployeeNode removeFromFront() {
        if(isEmpty()) return null;
        EmployeeNode deleteFrontNode = head;

        if(head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        deleteFrontNode.setNext(null);
        return deleteFrontNode;
    }

    public EmployeeNode removeFromEnd() {
        if(head == null) return null;
        EmployeeNode deletedTailNode = tail;

        if(tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        deletedTailNode.setPrevious(null);
        return deletedTailNode;
    }


    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public Boolean isEmpty() {
        return head == null;
    }
}
