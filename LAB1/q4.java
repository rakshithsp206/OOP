import java.util.*;
public class q4 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

      System.out.print("Enter Radius: ");
      int rad=sc.nextInt();
      int diameter=rad*2;
      double circf=2*(Math.PI)*rad;
      double area=(Math.PI)*rad*rad;

      System.out.println("Diameter ="+diameter);
      System.out.println("cicumference = "+circf);
      System.out.println("Area = "+area);
    }
}

