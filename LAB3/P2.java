
abstract class figure{
    double r;
    double a;
    double v;
    double pi=3.1420;
    public abstract void dispArea();
    public abstract void dispVol();
    public abstract void calcArea();
    public abstract void calcVol();
}
class cone extends figure{
    double h;
    double s;
    cone(double Radius,double Height){
        r=Radius;
        h=Height;
        s=Math.sqrt(Radius*Radius+Height*Height);
    }
    public void calcArea(){
        a=pi*r*(r+s);
    }
    public void dispArea(){
        System.out.println("Area of cone= "+a);
    }
    public void calcVol(){
        v=(pi*r*r*h)/3;
    }
    public void dispVol(){
        System.out.println("Volume of cone = "+v);
    }
}

class cylinder extends figure{
    double h;
    cylinder(double Radius,double Height){
        r=Radius;
        h=Height;
    }
    public void calcArea(){
        a=2*pi*r*h;
    }
    public void dispArea(){
        System.out.println("Area of Cylinder= "+a);
    }
    public void calcVol(){
        v=(pi*r*r*h);
    }
    public void dispVol(){
        System.out.println("Volume of Cylinder= "+v);
    }
}

class Sphere extends figure{
    Sphere(double Radius){
        r=Radius;
    }
    public void calcArea(){
        a=4*pi*r*r;
    }
    public void dispArea(){
        System.out.println("Area of Sphere= "+a);
    }
    public void calcVol(){
        v=(4*pi*r*r*r)/3;
    }
    public void dispVol(){
        System.out.println("Volume of Sphere= "+v);
    }
}

public class P2 {
    public static void main(String[] args) {
        cone c=new cone(4.5,8);
        c.calcArea();
        c.dispArea();
        c.calcVol();
        c.dispVol();

        cylinder cyl=new cylinder(4.5, 5);
        cyl.calcArea();
        cyl.dispArea();
        cyl.calcVol();
        cyl.dispVol();

        Sphere sph=new Sphere(7);
        sph.calcArea();
        sph.dispArea();
        sph.calcVol();
        sph.dispVol();

    }
    
}
