abstract class Car{
    String brand;
    public Car(String name){
        this.brand=name;
    }
    public void Brand(){
        System.out.println("Car Brand: "+brand);
    }
    abstract public void avg();
    abstract public void model();
}

class Maruti extends Car{
    public Maruti(){
        super("Maruti");
    }
    public void avg(){
        System.out.println("Average Milage is 30");
    }
    public void model(){
        System.out.println("Model is Swift");
    }
}

class Santro extends Car{
    public Santro(){
        super("Hyundai");
    }
    public void avg(){
        System.out.println("Average Milage is 28");
    }
    public void model(){
        System.out.println("Model is Santro");
    }
}

public class L6P4 {
    public static void main(String[] args) {
        Car m=new Maruti();
        Car s=new Santro();

         m.Brand();
        m.avg();
        m.model();

        s.Brand();
        s.avg();
        s.model();

    }
    
}
