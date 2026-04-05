class CarType{
    String CarID;
    float Mileage;
    double price;
    public CarType(String CarID,float Mileage,double price){
        this.CarID=CarID;
        this.Mileage=Mileage;
        this.price=price;
    }
}
class ElectricCar extends CarType{
    float BatteryWatt;
    public ElectricCar(String CarID,float Mileage,double price,float Watt){
        super(CarID,Mileage,price);
        this.BatteryWatt=Watt;
    }

    public void ChangeWatt(float watt){
        BatteryWatt=watt;
    }

    public void Display(){
        System.out.println("CarId: "+CarID);
        System.out.println("Mileage: "+Mileage);
        System.out.println("Price: "+price);
        System.out.println("Watt: "+BatteryWatt);
    }
}
public class test2 {
    public static void main(String[] args) {
        ElectricCar e=new ElectricCar("456R", 30, 700000, 400);
        e.ChangeWatt(300);
        e.Display();
    }
}
