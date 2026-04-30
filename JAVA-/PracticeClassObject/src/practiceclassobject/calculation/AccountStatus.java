package practiceclassobject.calculation;

public class AccountStatus {

    private int accNo;
    private double balance;
    private int deposite;
    private double withdraw;

    public AccountStatus() {
        
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getDeposite() {
        return deposite;
    }

    public void setDeposite(int deposite) {
        this.deposite = deposite;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double deposite() {

        balance += deposite;
        return balance;
    }

    public double withdraw() {

        if (balance >= withdraw) {
            balance -= withdraw;
        } else {
            System.out.println("insufficient Amount");
        }
        return balance;
    }

}
