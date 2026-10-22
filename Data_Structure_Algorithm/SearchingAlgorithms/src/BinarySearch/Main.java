package BinarySearch;


public class Main{

    public static int binarySearch(int[] arr, int ele) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == ele) {
                return mid;
            }
            else if (ele < arr[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int ele = 50;

        int index = Main.binarySearch(arr, ele);

        if (index != -1) {
            System.out.println("Element found");
        }
        else {
            System.out.println("Not found");
        }
    }
}
