import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class L8P5 {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("sdj.txt"));
            for (String line : lines) {
                String[] words=line.split(" ");
                for(int i=0;i<words.length;i++){
                    if(words[i].toLowerCase().equals("his")){
                        words[i]="her";
                    }
                    System.out.print(words[i]+" ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
