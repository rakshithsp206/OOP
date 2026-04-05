class Course{
    String ID;
    String Desc;
    int Duration;
    int fees;
    public Course(String ID,String Desc,int Duration,int fees){
        this.ID=ID;
        this.Desc=Desc;
        this.Duration=Duration;
        this.fees=fees;
    }
    public void getData(){
        System.out.println("Course ID: "+ID);
        System.out.println("Description: "+Desc);
        System.out.println("Duration: "+Duration);
        System.out.println("Fees: "+fees);
        System.out.println();
    }
}
public class L7P6 {
    public static void main(String[] args) {
        Course[] arr=new Course[5];
        arr[0]=new Course("doAI","Artificial Intelligence",4,75000);
        arr[1]=new Course("doCSE","Computer Science",4,70000);
        arr[2]=new Course("doECE","Electronics & Communication",4,65000);
        arr[3]=new Course("doEE","Electrical",4,65000);
        arr[4]=new Course("doCE","Civil Engineering",4,55000);
        arr[0].getData();
        arr[1].getData();
        arr[2].getData();
        arr[3].getData();
        arr[4].getData();
    }
}
