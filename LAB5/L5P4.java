
class Fruit{
    String name;
    String type;
    float price;
    Fruit(String name,String type,float price){
        this.name=name;
        this.type=type;
        this.price=price;
    }
    public void Display(){
        System.out.println("Fruit name: "+name);
        System.out.println("Fruit type: "+type);
        System.out.println("Price: "+price);
    }
}
public class L5P4 {
    public static void main(String[] args) {
        Fruit mango=new Fruit("Mango","Single",40);
        Fruit grape=new Fruit("Grape","Bunch", 50);
        mango.Display();
        grape.Display();
    }
}
