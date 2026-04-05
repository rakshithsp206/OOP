
import java.util.Scanner;

class point3D{
    public int x,y,z;
    public point3D(){}
    public point3D(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x: ");
        this.x=sc.nextInt();
        System.out.print("Enter y: ");
        this.y=sc.nextInt();
        System.out.print("Enter z: ");
        this.z=sc.nextInt();
    }
    public void output(){
        System.out.println("("+x+","+y+","+z+")");
    }
    public double distance(point3D p){
        int x1=this.x-p.x;
        int y1=this.y-p.y;
        int z1=this.z-p.z;
        return Math.sqrt(x1*x1+y1*y1+z1*z1);
    }
}
public class L6P6 {
    public static void main(String[] args) {
        point3D O=new point3D(0, 0, 0);
        point3D P=new point3D();
        P.input();
        O.output();
        P.output();
        System.out.println("Distance: "+O.distance(P));
    }
}
