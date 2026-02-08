package testarray;

import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {

        String studentName[] = new String[14];
        int studentAge[] = new int[14];
        
//        ----array aivabe o eksathe neya jay----
        int number[]={10,20,30,40,50,60,70,80};

        studentName[0] = "Badrul";
        studentName[1] = "Shimul";
        studentName[4] = "Hasan";

        studentAge[0] = 20;
        studentAge[2] = 21;
        studentAge[5] = 22;

    
        System.out.println(Arrays.toString(studentName));
        System.out.println(Arrays.toString(studentAge));

        System.out.println((studentName[4] + " " + studentAge[2]));

    }
}
