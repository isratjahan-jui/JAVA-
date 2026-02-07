
package learnobjectclass;

import learnobjectclass.circel.CircelAreaPerimeter;

public class LearnObjectClass {

  
    public static void main(String[] args) {
      
        CircelAreaPerimeter cap =new CircelAreaPerimeter();
        cap.radius=5;
        System.out.println(cap.getArea());
        System.out.println(cap.getPerimeter());
        
    }
    
}
