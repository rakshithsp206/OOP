class Student{
    String name;
    float avg;
    public void Average(float m1,float m2,float m3){
        avg=(m1+m2+m3)/3;
        if(avg>50){
            System.out.println("Pass!");
        }
        else{
            System.out.println("Fail!");
        }
    }
    public void InputName(String name){
        this.name=name;
        System.out.println("Name: "+name);
    }
}
public class L5P6 {
    public static void main(String[] args) {
        Student Harry=new Student();
        Harry.InputName("Harry");
        Harry.Average(60, 69, 87);
    }
}
