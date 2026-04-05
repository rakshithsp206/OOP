import java.util.Scanner;

public class L8P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if("AEIOUaeiou".indexOf(s.charAt(i))!=-1){
                System.out.println(s.charAt(i)+" "+i);
            }
        }
    }
}
