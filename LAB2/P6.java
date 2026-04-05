
import java.util.Scanner;
public class P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account number: ");
        int AccNo=sc.nextInt();
        System.out.print("Enter Balance At Beggining of Month: ");
        float balance=sc.nextFloat();
        System.out.print("Enter Total charges: ");
        float charges=sc.nextFloat();
        System.out.print("Enter Total Credits: ");
        float credits=sc.nextFloat();
        System.out.print("Enter credit limit: ");
        float creditlimit=sc.nextFloat();

        float newbalance=balance+charges-credits;
        if(newbalance>creditlimit){
            System.out.println("Credit limit exceeded!");
        }
        else{
            System.out.println("Credit limit not exceeded!");
        }
    }
}
