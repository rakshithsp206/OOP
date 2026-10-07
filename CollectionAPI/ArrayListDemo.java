
import java.util.ArrayList;
import java.util.Collections;



class Student implements Comparable<Student>{
    String name;
    int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }

    @Override
    public int compareTo(Student s){
        return s.marks-this.marks;
    }

    @Override
    public int hashCode() {
        String marksStr=String.valueOf(marks);

        return name.hashCode()+marksStr.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Student that=(Student)obj;
        if(this.name.equals(that.name)){
            return true;
        }
        if(this.marks==that.marks){
            return true;
        }
        return false;
    }

    
}
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> s=new ArrayList<>();
        s.add(new Student("Achal", 100));
        s.add(new Student("Akash", 60));
        s.add(new Student("Ramesh", 79));
        s.add(new Student("Achal", 100));
        System.out.println(s.get(0).hashCode());
        System.out.println(s.get(3).hashCode());
        System.out.println(s.get(0).equals(s.get(3)));
        Collections.sort(s);
        System.out.println(s);
    }
}
