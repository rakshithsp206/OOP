class Teacher{
    String ID;
    String Name;
    public Teacher(String ID,String Name){
        this.ID=ID;
        this.Name=Name;
    }
}
class Student extends Teacher{
    double gpa;
    public Student(String ID,String Name,double gpa){
        super(ID, Name);
        this.gpa=gpa;
    }
    public void Display(){
        System.out.println("Name: "+Name);
        System.out.println("ID: "+ID);
        System.out.println("GPA: "+gpa);
    }
}
public class L7P4 {
    public static void main(String[] args) {
        Student s=new Student("I25AI040","RAKSHITH",9.3);
        s.Display();
    }
}
