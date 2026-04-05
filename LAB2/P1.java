import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter Total miles driven per day: ");
        float MilesPerDay=sc.nextFloat();
        System.out.print("Enter Cost per Gallon: ");
        float CostPerGallon=sc.nextFloat();
        System.out.print("Enter Miles per Gallon: ");
        float MilesPerGallon=sc.nextFloat();
        System.out.print("Enter Toll fees per day: ");
        float TollFee=sc.nextFloat();

        float TotalCost;
        TotalCost=MilesPerDay*CostPerGallon/MilesPerGallon+TollFee;

        System.out.println("Total Cost is "+TotalCost);
    }
}
