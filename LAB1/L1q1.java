import java.util.*;
public class L1q1{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int a=sc.nextInt();
        System.out.println("Enter num 2: ");
        int b=sc.nextInt();
        
        System.out.println("Sum ="+(a+b));
        System.out.println("Difference ="+(a-b));
        System.out.println("Product ="+(a*b));
        System.out.println("Quotient ="+((float)a/b));
    }
}