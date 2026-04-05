

class Invoice{
    String PartNumber;
    String PartDesc;
    int Quantity;
    double price;
    public Invoice(String pn,String pd,int qty,double prc){
        PartNumber=pn;
        PartDesc=pd;
        Quantity=qty;
        price=prc;
    }
    public void get(){
        System.out.println("Part Number: "+PartNumber);
        System.out.println("Part Description: "+PartDesc);
        System.out.println("Quantity= "+Quantity);
        System.out.println("Price= "+price);
    }
    public double getInvoiceAmount(){
        double Amount=Quantity*price;
        return Amount;
    }
}

public class P2 {
    public static void main(String[] args) {
        Invoice inv=new Invoice("T125","Pipe",120,75.5);
        inv.get();
        double amount=inv.getInvoiceAmount();
        System.out.println("The Amount is "+amount);
    }
}
