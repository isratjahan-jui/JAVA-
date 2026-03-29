package twodimensionalarray;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] myArrays = {{1, 99, 91, 11, 44},
        {0, 10, 9, 9, 11},
        {3, 23, 21, 5, 20},
        {13, 4, 45, 66, 33},
        {11, 0, 1, 20, 56}

        };
// ........ 1 .......
        for (int[] item : myArrays) {
            for (int i = 0; i < item.length; i++) {
                for (int j = 0; j < item.length - 1 - i; j++) {

                    if (item[j] > item[j + 1]) {
                        int temp = item[j];
                        item[j] = item[j + 1];
                        item[j + 1] = temp;

                    }
                }
            }
        }
//        .......
       
        
//......2.another rules....
//        for(int i = 0; i < myArrays.length; i++) {
//           for (int j = 0; j < myArrays[i].length - 1; j++) {
//
//            for (int k = 0; k < myArrays[i].length - 1 - j; k++) {
//
//                if(myArrays[i][k] >myArrays[i][k+1]) {
//                    int temp = myArrays[i][k];
//                    myArrays[i][k] = myArrays[i][k+1];
//                    myArrays[i][k+1] = temp;
//                }
//            }
//        }
//        }
//.............................



        for (int[] item : myArrays) {
            System.out.println(Arrays.toString(item));
        }

    }
}
