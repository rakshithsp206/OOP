import java.util.Scanner;

class Player1 extends Thread{
    int randInt;
    static int score;
    public void run(){
        randInt = (int)(Math.random() * 100);
        System.out.println("Player1: "+randInt);
    }
}
class Player2 extends Thread{
    int randInt;
    static int score;
    public void run(){
        randInt = (int)(Math.random() * 100);
        System.out.println("Player2: "+randInt);
    }
}
public class L9P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        while (true) { 
            System.out.println("1.Continue");
            System.out.println("0.Stop");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            System.out.println();
            switch(choice){
                case 1:
                    Player1 p1=new Player1();
                    Player2 p2=new Player2();
                    p1.start();
                    p2.start();
                    try {
                        p1.join();
                        p2.join();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if(p1.randInt>p2.randInt){
                        Player1.score+=p1.randInt-p2.randInt;
                        System.out.println("Player 1 Wins!");
                    }
                    else if(p1.randInt==p2.randInt){
                        System.out.println("It's a tie!");
                    }
                    else{
                        Player2.score+=p2.randInt-p1.randInt;
                        System.out.println("Player 2 Wins!");
                    }
                    System.out.println();
                    System.out.println("Current Score: ");
                    System.out.println("Player 1: "+Player1.score);
                    System.out.println("Player 2: "+Player2.score);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Exiting game...");
                    if(Player1.score>Player2.score){
                        System.out.println("Player 1 is the Winner!!!");
                    }
                    else{
                        System.out.println("Player 2 is the Winner!!!");
                    }
                    return;
                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }
        }
    }
}
