import java.util.Scanner;
class Employee{
    int hours;
    double grossPay;
    double Netpay;
    public void calculateNetpay(int hours){
        this.hours=hours;
        grossPay=(float)hours*12;
        Netpay=(1-0.15)*grossPay;
        System.out.println("Net Pay= "+Netpay);
    }
}
public class l5p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of hours of work: ");
        int h=sc.nextInt();
        Employee aryan=new Employee();
        aryan.calculateNetpay(h);
    }
}
