package exampracticefactorial;

public class ExamPracticeFactorial {

    public static void main(String[] args) {
        int factorial = 1;
        int input=5;
        
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println("Factorial is " + factorial);

    }

}
