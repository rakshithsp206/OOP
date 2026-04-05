import java.util.Scanner;
class Password{
    String passwrd;
    Password(String pass){
        passwrd=pass;
    }

    public void checkLowercase(){
        for(int i=0;i<passwrd.length();i++){
            if(passwrd.charAt(i)>=98 && passwrd.charAt(i)<=123){
                return;
            }
        }
        System.out.println("INVALID!!! No lowercase characters");
    }

    public void checkUppercase(){
        for(int i=0;i<passwrd.length();i++){
            if(passwrd.charAt(i)>=65 && passwrd.charAt(i)<=90){
                System.out.println("INVALID!!! Uppercase character not allowed");
                return;
            }
        }
    }
    
    public void checkSpecial(){
        for(int i=0;i<passwrd.length();i++){
            if((passwrd.charAt(i)>=33 && passwrd.charAt(i)<=47) || (passwrd.charAt(i)>=91 && passwrd.charAt(i)<=96) || (passwrd.charAt(i)>=58 && passwrd.charAt(i)<=64)){
                System.out.println("INVALID!!! Special character not allowed");
                return;
            }
        }
    }

    public void checkDigit(){
        for(int i=0;i<passwrd.length();i++){
            if(passwrd.charAt(i)>=48 && passwrd.charAt(i)<=57){
                return;
            }
        }
        System.out.println("INVALID!!! No digits");
    }

    public void checkLength(){
        if(passwrd.length()<5 || passwrd.length()>12){
            System.out.println("INVALID!!! length should be 5-12");
        }
    }

    public void checkImmediatePattern(){
        int n=passwrd.length();

        for(int len=1;len<=n/2;len++){
            for(int i=0;i+2*len<=n;i++){
                String a=passwrd.substring(i,i+len);
                String b=passwrd.substring(i+len,i+2*len);
                if(a.equals(b)){
                    System.out.println("Invalid Password!!! Immediate pattern detected");
                    return;
                }
            }
        }
    }

    public void check(){
        checkDigit();
        checkLength();
        checkLowercase();
        checkUppercase();
        checkSpecial();
        checkImmediatePattern();
    }
}

public class P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password: ");
        String pass=sc.next();
        Password p=new Password(pass);
        p.check();
    }
}
