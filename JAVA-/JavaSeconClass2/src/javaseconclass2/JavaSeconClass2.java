
package javaseconclass2;

import java.util.Scanner;

public class JavaSeconClass2 {

  
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter seconds: ");

        int seconds = scanner.nextInt();
        int minutes = seconds / 60;
        int second = seconds % 60;

        String minMassage = "minute";
        if (minutes > 1) {
            minMassage = " minutes ";
        } else {
            minMassage = " minute ";
        }

        System.out.println(minutes + minMassage   + second + " seconds");
        
        
//         Scanner scanner = new Scanner(System.in);
//        System.out.print("enter seconds: ");
//
//        int seconds = scanner.nextInt();
//        int minutes = seconds / 60;
//        int second = seconds % 60;
//        System.out.println(minutes + " minutes " + second + " seconds");
      
        
        
    }
    
}
