import java.io.File;
import java.io.FileReader;

public class fileRead {
    public static void main(String[] args) {
        File f1= new File("test.txt");
        
        try(FileReader fr= new FileReader(f1)) {
            
            System.out.println(fr.readAllLines());
        } catch (Exception e) {

        }
        
    }
}
