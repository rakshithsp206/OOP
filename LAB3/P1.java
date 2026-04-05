class figure{
    double r;
    double a;
    double v;
    public void dispArea(){
        System.out.println("Area = "+a);
    }
    public void dispVolume(){
        System.out.println("Volume = "+v);
    }
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
        a=Math.PI*r*(r+s);
        dispArea();
    }
    public void calcVolume(){
        v=(Math.PI*r*r*h)/3;
        dispVolume();
    }
}
public class P1 {
    public static void main(String[] args) {
        cone c=new cone(4.5,8);
        c.calcArea();
        c.calcVolume();
    }
    
}
