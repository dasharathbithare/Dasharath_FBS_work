
package com.firstbit.demos;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SinglyLInkedList mylist = new SinglyLInkedList();

        int choice;
        int data;
        int position;

        do {
            System.out.println("\n-------Menu-------");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete from beginning");
            System.out.println("5. Delete from end");
            System.out.println("6. Delete from position");
            System.out.println("7. Display");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    mylist.insertAtBeg(data);
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    mylist.insertAtEnd(data);
                    break;

                case 3:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();

                    System.out.print("Enter position: ");
                    position = sc.nextInt();

                    mylist.insertAtPosition(data, position);
                    break;

                case 4:
                    mylist.deleteFromBeg();
                    break;

                case 5:
                    mylist.deleteFromEnd();
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    position = sc.nextInt();

                    mylist.deleteAtPosition(position);
                    break;

                case 7:
                    mylist.display();
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}
