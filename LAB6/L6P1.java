import java.util.Scanner;
class Theater{
    int Attendees;
    public double TotalProfit(int n){
        return (n*5-n*0.5-20);
    }
}

public class L6P1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no.of Attendees: ");
        int n=sc.nextInt();
        Theater movie=new Theater();
        System.out.println("Total Profit: $"+movie.TotalProfit(n));
    }
}
