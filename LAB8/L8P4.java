import java.util.Scanner;

public class L8P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Line of Text: ");
        String Line=sc.nextLine();
        String[] words=Line.split(" ");
        for(String word: words){
            System.out.print(word.substring(0, 1).toUpperCase()+word.substring(1)+" ");
        }
    }
}
