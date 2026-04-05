import java.util.Scanner;
public class consonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        StringBuilder s=new StringBuilder(str);
        for(int i=0;i<s.length();i++){
            if("BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(s.charAt(i))!=-1){
                s.setCharAt(i, '#');
            }
        }
        str=s.toString();
        System.out.println(str);
    }
}
