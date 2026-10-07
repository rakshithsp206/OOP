

class Hello extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello!!!");
        }
    }
}
public class L9P1 {
    public static void main(String[] args) {
        Hello hello=new Hello();
        try {
            hello.start();
            hello.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
