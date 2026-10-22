
package com.firstbit.demos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DemoArrayList list = new DemoArrayList();

        int choice;
        int index;
        int data;

        do {
            System.out.println("\n----- ArrayList Menu -----");
            System.out.println("1. Add element");
            System.out.println("2. Get element");
            System.out.println("3. Search element");
            System.out.println("4. Remove element");
            System.out.println("5. Display");
            System.out.println("6. Size");
            System.out.println("7. Check Empty");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter index: ");
                    index = sc.nextInt();

                    System.out.print("Enter data: ");
                    data = sc.nextInt();

                    list.add(index, data);
                    System.out.println("Data inserted successfully");
                    break;

                case 2:
                    System.out.print("Enter index: ");
                    index = sc.nextInt();

                    try {
                        System.out.println("Element: " + list.get(index));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid index");
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    data = sc.nextInt();

                    index = list.search(data);

                    if (index != -1) {
                        System.out.println("Element found at index: " + index);
                    } else {
                        System.out.println("Element not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter element to remove: ");
                    data = sc.nextInt();

                    if (list.remove(data)) {
                        System.out.println("Element removed successfully");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;

                case 5:
                    System.out.print("ArrayList: ");
                    list.display();
                    break;

                case 6:
                    System.out.println("Size: " + list.size());
                    break;

                case 7:
                    if (list.isEmpty()) {
                        System.out.println("ArrayList is Empty");
                    } else {
                        System.out.println("ArrayList is not Empty");
                    }
                    break;

                case 8:
                    System.out.println("Program Exited");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 8);

        sc.close();
    }
}
