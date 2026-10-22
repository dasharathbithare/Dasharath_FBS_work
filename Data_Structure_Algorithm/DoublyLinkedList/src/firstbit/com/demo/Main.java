
package firstbit.com.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyDoublyLinkedList list = new MyDoublyLinkedList();

        int choice;
        int data;

        do {
            System.out.println("\n--- Doubly Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();

                    list.insertAtBeg(data);
                    System.out.println("Data inserted at beginning");
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();

                    list.insertAtEnd(data);
                    System.out.println("Data inserted at end");
                    break;

                case 3:
                    list.display();
                    break;

                case 4:
                    System.out.println("Program Exited");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
