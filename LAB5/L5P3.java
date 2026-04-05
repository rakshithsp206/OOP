class Product{
    String ProductID;
    String name;
    String CategoryID;
    float price;
    Product(String ID,String nam,String catID,float prc){
        this.ProductID=ID;
        this.name=nam;
        this.CategoryID=catID;
        this.price=prc;
    }
}
class ElectricProduct extends Product{
    float VoltageRange;
    float Wattage;
    ElectricProduct(String ID,String nam,String catID,float prc,float volt,float watt){
        super(ID,nam,catID,prc);
        this.VoltageRange=volt;
        this.Wattage=watt;
    }
    public void ChangeWattage(float watt){
        this.Wattage=watt;
    }
    public void ChangePrice(float prc){
        this.price=prc;
    }
    public void Display(){
        System.out.println("Product ID: "+ProductID);
        System.out.println("Name: "+name);
        System.out.println("Category ID: "+CategoryID);
        System.out.println("Unit Price: "+price);
        System.out.println("Voltage Range: "+VoltageRange);
        System.out.println("Wattage: "+Wattage);
    }
}
public class L5P3 {
    public static void main(String[] args) {
        ElectricProduct fan=new ElectricProduct("S678","Bajaj Fan","E23", 5000, 230, 50);
        fan.ChangePrice(650);
        fan.ChangeWattage(55);
        fan.Display();

    }
}
