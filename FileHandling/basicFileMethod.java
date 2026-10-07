import java.io.File;
import java.io.FileWriter;

public class basicFileMethod {
    public static void main(String[] args) {
        try {
            File f1 = new File("test.txt");
            System.out.println(f1.exists());

            FileWriter fw=null;

            try {
                fw=new FileWriter(f1);
                fw.write("This is just a testing");
            } catch (Exception e) {
            }
            finally{
                if(fw!=null) {
                     fw.flush();
                     fw.close();
                } 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
