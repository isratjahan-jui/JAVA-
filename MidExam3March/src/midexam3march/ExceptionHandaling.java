package midexam3march;

public class ExceptionHandaling {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            a = a / b;
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
    }

}
