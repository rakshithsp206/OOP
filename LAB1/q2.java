import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a=sc.nextInt();
        System.out.print("Enter num2: ");
        int b=sc.nextInt();
        
        if(a>b){
            System.out.println(a+" is greater");
        }
        else if(a==b){
            System.out.println("The numbers are equal");
        }
        else{
            System.out.println(b+" is greater");
        }
    }}

