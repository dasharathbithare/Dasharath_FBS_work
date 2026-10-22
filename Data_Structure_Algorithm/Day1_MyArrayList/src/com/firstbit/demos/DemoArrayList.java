
package com.firstbit.demos;

public class DemoArrayList {

    int size;
    int[] arr;
    int count;

    public DemoArrayList() {
        this.size = 10;
        this.arr = new int[size];
        this.count = 0;
    }

    public DemoArrayList(int capacity) {
        this.size = capacity;
        this.arr = new int[size];
        this.count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public boolean calPercentage() {
        int per = (count * 100) / size;
        return per >= 75;
    }

    public int[] resize() {
        if (calPercentage()) {
            int newSize = (int) (size * 1.5);

            if (newSize <= size) {
                newSize = size + 1;
            }

            int[] temp = new int[newSize];

            for (int i = 0; i < count; i++) {
                temp[i] = arr[i];
            }

            size = newSize;
            return temp;
        }

        return arr;
    }

    public void add(int index, int data) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (count == size || calPercentage()) {
            arr = resize();
        }

        for (int i = count; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = data;
        count++;
    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        return arr[index];
    }

    public int search(int data) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == data) {
                return i;
            }
        }

        return -1;
    }

    public boolean remove(int ele) {
        int index = search(ele);

        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                arr[i] = arr[i + 1];
            }

            count--;
            return true;
        }

        return false;
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
