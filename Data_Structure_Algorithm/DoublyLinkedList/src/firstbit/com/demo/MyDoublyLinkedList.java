
package firstbit.com.demo;

class MyDoublyLinkedList {

    Node start;

    // Insert at Beginning
    public void insertAtBeg(int data) {
        Node newNode = new Node(data);

        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
    }

    // Insert at End
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
        newNode.prev = p;
    }

    // Display
    public void display() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        Node p = start;

        while (p != null) {
            System.out.print(p.data + " <-> ");
            p = p.next;
        }

        System.out.println("NULL");
    }
}
