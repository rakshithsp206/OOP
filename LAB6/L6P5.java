class bank{
    public double Deposit(double amount,double balance){
        return amount+balance;
    }
    public double Withdraw(double amount,double balance){
        return (amount>balance)?0:balance-amount;
    }
}
public class L6P5 {
    public static void main(String[] args) {
        bank bob=new bank();
        System.out.println(bob.Deposit(30000, 50000));
        System.out.println(bob.Withdraw(5000, 40000));
    }
}
