package searchingarray;

public class SearchingArray {

    public static void main(String[] args) {
        int numbers[] = {23, 45, 12, 3, 56, 71, 19, 30, 33};
        int search = 33;

        System.out.println(" index number " + (LinearSearch(numbers, search)));

    }

    public static int LinearSearch(int[] array, int searchNumber) {

        int result = -1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == searchNumber) {
                result = index;
                break;
            }
        }
        return result;
    }

}
