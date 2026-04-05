class Book{
    String BookID;
    String Title;
    String Author;
    float price;
    Book(String BookID,String Title,String Author,float price){
        this.BookID=BookID;
        this.Title=Title;
        this.Author=Author;
        this.price=price;
    }
}

class Periodical extends Book{
    String Period;

    public Periodical(String BookID,String Title,String Author,float price,String Period) {
        super(BookID,Title,Author,price);
        this.Period=Period;
    }
    
    public void modifyPrice(float price){
        this.price=price;
    }

    public void modifyPeriod(String Period){
        this.Period=Period;
    }

    public void Display(){
        System.out.println("Book ID: "+BookID);
        System.out.println("Title: "+Title);
        System.out.println("Author: "+Author);
        System.out.println("Price: "+price);
        System.out.println("Period: "+Period);
    }
}
public class L7P3 {
    public static void main(String[] args) {
        Periodical p=new Periodical("I25UIP", "Tunturu", "Robert Raju", 30, "Weekly");
        p.modifyPrice(40);
        p.modifyPeriod("Monthly");
        p.Display();
    }
}
