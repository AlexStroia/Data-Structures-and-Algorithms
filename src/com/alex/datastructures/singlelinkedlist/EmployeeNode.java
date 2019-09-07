package com.alex.datastructures.singlelinkedlist;

import com.alex.datastructures.Employee;

/*Each node has a refference to the next node*/
public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "EmployeeNode{" +
                "employee=" + employee +
                ", next=" + next +
                '}';
    }
}
