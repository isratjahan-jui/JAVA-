package practiceclassobject;

import practiceclassobject.calculation.AccountStatus;
import practiceclassobject.calculation.POS;

public class PracticeClassObject {

    public static void main(String[] args) {
//   ----- Pos----
        POS c = new POS();

//        double finalPrice = c.calculateFinalPrice(50, 3); 
//        System.out.println("Final Price: " + finalPrice);
        System.out.println("Final Price: " + c.calculateFinalPrice(50, 3));

        System.out.println("Final Price: " + c.calculateFinalPrice(50, 10));
        System.out.println("Final Price: " + c.calculateFinalPrice(60, 20));
         
        
//     -------AccountStatus file----  

        AccountStatus as = new AccountStatus();
        as.setDeposite(5000);
        as.deposite();
        System.out.println(as.getBalance());

        as.setWithdraw(2000);
        as.withdraw();
        System.out.println(as.getBalance());

    }

}
