import java.util.Scanner;
public class L8P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a line: ");
        String s=sc.nextLine();
        int first=s.indexOf("the");
        StringBuilder sb=new StringBuilder(s);
        StringBuilder srev=sb.reverse();
        int x=srev.indexOf("eht");
        int last=s.length()-x;
        System.out.println(s.substring(first, last));
    }
}
