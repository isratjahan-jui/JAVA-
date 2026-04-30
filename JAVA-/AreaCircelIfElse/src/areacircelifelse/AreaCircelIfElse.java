
package areacircelifelse;

import java.util.Scanner;


public class AreaCircelIfElse {

 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float radius=scanner.nextFloat();
        float areaOfCircle;
        if(radius<=0){
            System.out.println("Incorrect Radius");
        }
        else{
            areaOfCircle=(float)(Math.PI* Math.pow(radius, 2));
//            areaOfCircle=(float)(3.1416*radius*radius);
            System.out.println("Area of Circel is "+  areaOfCircle);
        }
        
        
        
        
        
    }
    
}
