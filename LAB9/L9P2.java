class Hello implements Runnable{
    public Hello(){
        Thread t=new Thread(this);
        try {
            t.start();
            t.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello!!!");
        }
    }
}

public class L9P2 {
    public static void main(String[] args) {
        Hello hello=new Hello();
    }
}
