
import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Sliced String: "+str.substring(n));
    }
}
