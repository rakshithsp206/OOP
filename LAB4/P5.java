import java.util.Scanner;
public class P5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter Range: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Enter pattern: ");
        String pt=sc.next();
        int count=0;
        for(int i=a;i<b;i++){
            String st=Integer.toString(i);
            if(st.contains(pt)){
                count++;
            }
        }
        System.out.println("the no.of times "+pt+" occured is "+count);
    }
}