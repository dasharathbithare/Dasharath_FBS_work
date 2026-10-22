package LinearSearch;
class LinearSearch {

    public static int linearSearch(int[] arr, int ele) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }

        return -1;
    }
}

public class MainApp {

    public static void main(String[] args) {

        int[] arr = {56, 21, 92, 54, 12};
        int ele = 76;

        int index = LinearSearch.linearSearch(arr, ele);

        if (index != -1) {
            System.out.println(ele + " found at index: " + index);
        } else {
            System.out.println(ele + " not found");
        }
    }
}
