
package firstbit.demo;

public class MyStack {

    int[] stack;
    int size;
    int top;

    public MyStack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check whether stack is full
    public boolean isFull() {
        return top == size - 1;
    }

    // Insert element
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            stack[++top] = data;
            System.out.println("Data Inserted");
        }
    }

    // Delete top element
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            int x = stack[top];
            System.out.println(x + " is deleted");
            top--;
        }
    }

    // Show top element
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Peek element: " + stack[top]);
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
