// class A{
//     int num;
//     boolean NumSet=false;

//     public synchronized void getNum() {
//         while(!NumSet){
//             try {
//                 wait();
//             } catch (Exception e) {
//             }
//         }
//         System.out.println("Get : "+num);
//         NumSet=false;
//         notify();
//     }

//     public synchronized void setNum(int num) {
//         while(NumSet){
//             try {
//                 wait();
//             } catch (Exception e) {
//             }
//         }
//         System.out.println("Put : "+num);
//         this.num = num;
//         NumSet=true;
//         notify();
//     }
    
// }

// class Producer extends Thread{
//     A a;

//     public Producer(A a) {
//         this.a = a;
//     }
    
//     public void run(){
//         for(int i=0;i<20;i++){
//             a.setNum(i);

//         }
//     }
// }

// class Consumer extends Thread{
//     A a;

//     public Consumer(A a) {
//         this.a = a;
//     }
    
//     public void run(){
//         for(int i=0;i<20;i++){
//             a.getNum();
//         }
//     }

// }

// public class ProducerConsumer {
//     public static void main(String[] args) {
//         A a=new A();
//         Producer p=new Producer(a);
//         Consumer c=new Consumer(a);

//         p.start();
//         c.start();
//     }
// }

class A{
    int num;
    boolean NumSet=false;

    public synchronized void getNum() {
        System.out.println("Get : "+num);
    }

    public synchronized void setNum(int num) {
        System.out.println("Put : "+num);
        this.num = num;
    }
    
}

class Producer extends Thread{
    A a;
    Consumer c;
    public Producer(A a ){
        this.a = a;
        
    }
    
    public void run(){
        synchronized (this) {
            for(int i=0;i<20;i++){
                a.setNum(i);
                notify();
                try {
                    wait();
                } catch (Exception e) {
                }
                
            }
        }
    }
}

class Consumer extends Thread{
    A a;
    Producer p;
    public Consumer(A a, Producer p) {
        this.a = a;
        this.p = p;
    }
    
    public void run(){
        synchronized (p) {
            for(int i=0;i<20;i++){
                a.getNum();
                p.notify();
                try {
                    p.wait();
                } catch (Exception e) {
                }
            }
        }
    }

}

public class ProducerConsumer {
    public static void main(String[] args) {
        A a=new A();
        
        
        Producer p=new Producer(a);
        Consumer c=new Consumer(a,p);

        p.start();
        c.start();
    }
}
