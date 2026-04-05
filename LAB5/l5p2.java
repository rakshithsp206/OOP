import java.util.Scanner;
class Hexadecimal{
    String hex;
    public Hexadecimal(String hex) {
        this.hex=hex;
    }
    public void isValid(){
        
        for(int i=0;i<hex.length();i++){
            boolean valid=false;
            if(Character.isDigit(hex.charAt(i))){
                valid=true;
            }
            if(Character.isAlphabetic(hex.charAt(i))){
                if(hex.charAt(i)=='A' || hex.charAt(i)=='B' || hex.charAt(i)=='C' || hex.charAt(i)=='D' || hex.charAt(i)=='E' || hex.charAt(i)=='F'){
                    valid=true;
                }
            }
            if(valid==false){
                throw new IllegalArgumentException("Not a hexadecimal!!");
            }
        }
    }
}
public class l5p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter HexaDecimal No.: ");
        String h=sc.next();
        Hexadecimal hex=new Hexadecimal(h);
        try {
            hex.isValid();
            System.out.println("Valid Hexadecimal");
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}
