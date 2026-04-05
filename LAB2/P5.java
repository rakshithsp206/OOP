import java.util.Scanner;
public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float miles;
        float gallons;
        float Total=0;
        int x;
        do { 
            System.out.print("Enter miles driven: ");
            miles=sc.nextFloat();
            System.out.print("Enter Gallons used: ");
            gallons=sc.nextFloat();
            System.out.println("Miles per gallon of trip is "+miles/gallons);
            Total+=miles/gallons;
            System.out.print("1-Continue | 0-Stop: ");
            x=sc.nextInt();
        } while (x==1);
        System.out.println("Total miles per gallon for all trips= "+Total);
    }
}
