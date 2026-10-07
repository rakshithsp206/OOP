



class Hai extends Thread{
    public void run(){

        synchronized (this) {
            for(int i=0;i<20;i++){
                System.out.println("Hai!");
                notify();
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        }
    }
}

class Helloo extends Thread{
    Hai hai=null;

    public Helloo(Hai hai) {
        this.hai=hai;
    }
    
    public void run(){
        synchronized (hai) {
            for(int i=0;i<20;i++){
                System.out.println("Hello!");
                
                try {
                    hai.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                hai.notify();
            }
        }
    }
}

public class HiHello {
    public static void main(String[] args) {
        Hai hai=new Hai();
        Helloo hello=new Helloo(hai);

        
        hello.start();
        hai.start();
        
        
    }
}
