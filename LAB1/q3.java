import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a=sc.nextInt();
        System.out.print("Enter num1: ");
        int b=sc.nextInt();
        System.out.print("Enter num1: ");
        int c=sc.nextInt();
        int sum=a+b+c;
        float avg=(float)sum/3;
        int prod=a*b*c;
        int max=a;
        int min=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }

        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        System.out.println("Product = "+prod);
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }}

