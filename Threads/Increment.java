class Q{
    int i;
    public synchronized void increment(){
        i++;
    }
    public void getI(){
        System.out.println(i);
    }
}

class MyThread extends Thread{
    Q q;

    public MyThread(Q q) {
        this.q = q;
    }
    
    public void run(){
       for (int i=0;i<1000;i++) {
            q.increment();
       }
    }

}
public class Increment {
    public static void main(String[] args) {
        Q q=new Q();

        Thread t1=new MyThread(q);
        Thread t2=new MyThread(q);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        q.getI();
    }
}
