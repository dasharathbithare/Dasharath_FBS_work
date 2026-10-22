
package firstbit.demo;

public class MyQueue {

    int front;
    int rear;
    int size;
    int[] queue;

    public MyQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    // Check Empty
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    // Check Full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Insert Element
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        queue[rear] = data;
        System.out.println("Data is inserted");
    }

    // Delete Element
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(queue[front] + " is deleted");

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Display Front Element
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front element: " + queue[front]);
    }

    // Display All Elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % size;
        }

        System.out.println();
    }
}
