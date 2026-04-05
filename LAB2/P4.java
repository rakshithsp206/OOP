class Date{
    int day;
    int month;
    int year;

    public Date(int d,int m,int y){
        day=d;
        month=m;
        year=y;
    }

    public void DisplayDate(){
        System.out.println("Date: "+day+"/"+month+"/"+year);
    }
}

public class P4 {
    public static void main(String[] args) {
        Date dt=new Date(23,1,2026);
        dt.DisplayDate();
        
    }
    
}
