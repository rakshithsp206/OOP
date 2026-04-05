class SimpleInterest{
    float amount;
    double rate;
    float year;
    public SimpleInterest(float amount,double rate,int month){
        this.amount=amount;
        this.rate=rate;
        this.year=(float)month/12;
    }
    public double TotalInterest(){
        return amount*rate*year;
    }
}
public class L7P1 {
    public static void main(String[] args) {
        SimpleInterest s=new SimpleInterest(50000,0.04,5);
        System.out.println("Total Interest: "+s.TotalInterest());
    }
}
