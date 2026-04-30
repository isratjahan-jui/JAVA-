
package examjavafactorial;

public class ExamJavaFactorial {

 
    public static void main(String[] args) {
      
        int factorial=1;
        int input=5;
        for(int i=1;i<=input;i++){
            factorial*=i;
        }
        System.out.println("Factorial number is "+factorial);
        
    }
    
}
