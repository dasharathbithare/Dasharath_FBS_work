
package com.firstbit.demos;

public class SinglyLInkedList {

    Node start;

    SinglyLInkedList() {
        this.start = null;
    }

    // Insert at beginning
    public void insertAtBeg(int data) {
        Node newNode = new Node(data);

        newNode.next = start;
        start = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (start == null) {
            start = newNode;
            return;
        }

        Node p = start;

        while (p.next != null) {
            p = p.next;
        }

        p.next = newNode;
    }

    // Insert at position (1-based)
    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            insertAtBeg(data);
            return;
        }

        Node p = start;

        for (int i = 1; i < position - 1 && p != null; i++) {
            p = p.next;
        }

        if (p == null) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = p.next;
        p.next = newNode;
    }

    // Delete from beginning
    public void deleteFromBeg() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        start = start.next;
    }

    // Delete from end
    public void deleteFromEnd() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        if (start.next == null) {
            start = null;
            return;
        }

        Node p = start;

        while (p.next.next != null) {
            p = p.next;
        }

        p.next = null;
    }

    // Delete at position (1-based)
    public void deleteAtPosition(int position) {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            deleteFromBeg();
            return;
        }

        Node p = start;

        for (int i = 1; i < position - 1 && p != null; i++) {
            p = p.next;
        }

        if (p == null || p.next == null) {
            System.out.println("Invalid position");
            return;
        }

        p.next = p.next.next;
    }

    // Display list
    public void display() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        Node ptr = start;

        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }
}
