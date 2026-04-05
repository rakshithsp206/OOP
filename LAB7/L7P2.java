class vehicle{
    int maxSpeed;
    int tyres;
    public vehicle(int maxSpeed,int tyres){
        this.maxSpeed=maxSpeed;
        this.tyres=tyres;
    }
    public void maxSpeed(){
        System.out.println("Maximum Speed: "+maxSpeed);
    }
}
class Car extends vehicle{
    int Mileage;
    public Car(int maxSpeed,int tyres,int Mileage){
        super(maxSpeed, tyres);
        this.Mileage=Mileage;
    }
}
class Scooter extends vehicle{
    int Mileage;
    public Scooter(int maxSpeed,int tyres,int Mileage){
        super(maxSpeed, tyres);
        this.Mileage=Mileage;
    }
}

class Bicycle extends vehicle{
    public Bicycle(int maxSpeed,int tyres){
        super(maxSpeed, tyres);
    }
}

public class L7P2 {
    public static void main(String[] args) {
        Car c=new Car(120,4,30);
        Scooter s=new Scooter(100, 2, 40);
        Bicycle b=new Bicycle(40, 2);
        c.maxSpeed();
        s.maxSpeed();
        b.maxSpeed();
    }
}
