import java.util.Arrays;
import java.util.Scanner;

public class L8P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] names=new String[10];
        for (int i = 0; i < 10; i++) {
            String name=sc.nextLine();
            names[i]=name.substring(3);
        }
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
    }
}
