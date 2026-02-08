package bainarysearch;

import java.util.Arrays;

public class BainarySearch {

    public static void main(String[] args) {

        int numbers[] = {23, 45, 12, 3, 56, 71, 19, 30, 33};
//        int search = 30;
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        
//        System.out.println("Index number: " + BinarySearch(numbers, search));

        System.out.println("Index number: " + Arrays.binarySearch(numbers, 19));
    }

    public static int BinarySearch(int[] array, int searchNumber) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == searchNumber) {
                return mid;
            } else if (array[mid] < searchNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
