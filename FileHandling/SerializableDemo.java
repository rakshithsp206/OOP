import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

class Course implements Serializable{
    int credit;
    String title;
    public Course(int credit, String title) {
        this.credit = credit;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course [credit=" + credit + ", title=" + title + "]";
    }
    
}
public class SerializableDemo {
    public static void main(String[] args) {
        // ArrayList<Course> list=new ArrayList<>();
        // list.add(new Course(4,"OOP"));
        // list.add(new Course(5,"DSA"));
        // list.add(new Course(2,"IVS"));

        try {
            File f= new File("course.txt");
            // FileOutputStream fos=new FileOutputStream(f);
            // ObjectOutputStream oos=new ObjectOutputStream(fos);
            // oos.writeObject(list);

            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            
            List<Course> list1=(List<Course>) ois.readObject();
            System.out.println(list1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
