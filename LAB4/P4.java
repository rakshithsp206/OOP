import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        int Found=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    Found=1;
                    System.out.println("Not a Perfect string");
                    break;
                }
        }
        if(Found==1) break;
        }
        if(Found==0) {
            System.out.println("Perfect string");
        }
    }
}
