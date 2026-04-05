
import java.util.Scanner;
public class P7 {
    public static float CalculateCharge(int h){
        float charge=2;
        if(h>3){
            charge+=(h-3)*0.5;
        }
        if(charge>10){
            charge=10;
        }
        return charge;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,hour;
        float total=0;
        System.out.print("Enter No.of Custumers: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter Hours of parking: ");
            hour=sc.nextInt();
            System.out.println("Charge for person "+(i+1)+" is "+CalculateCharge(hour));
            total+=CalculateCharge(hour);
        }
        System.out.println("Total Collection for yesterday is "+total);
    }
}
