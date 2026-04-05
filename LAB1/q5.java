import java.util.*;
public class q5 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in)  ;
      System.out.print("Enter a 5-digit number: ");
      int n=sc.nextInt();
      int x=0,r;
      while(n>0){
        r=n%10;
        x=x*10+r;
        n/=10;
      }
      while(x>0){
        System.out.print(x%10+"   ");
        x/=10;
      }
    }
}
