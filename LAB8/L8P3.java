import java.util.Arrays;
import java.util.Scanner;

public class L8P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] names=new String[10];
        for (int i = 0; i < 10; i++) {
            String name=sc.nextLine();
            if(name.length()>3)
                names[i]=name.substring(3);
            else{
                names[i]="";
            }

        }
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
    }
}
