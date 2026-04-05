import java.util.Scanner;
class Queue{
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;
    public Queue(int capacity){
        arr=new int[capacity];
        front=0;
        rear=0;
        size=0;
        this.capacity=capacity;
    }
    void Enqueue(int x) throws Exception{
        if(size==capacity){
            throw new Exception("Overflow!!!");
        }
        arr[rear]=x;
        rear=(rear+1)%capacity;
        size++;
    }
    void Dequeue() throws Exception{
        if(size==0){
            throw new Exception("Underflow!!!");
        }
        front=(front+1)%capacity;
        size--;
    }
    void Display(){
        if(size==0){
            System.out.println("Empty!!");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[(front+i)%capacity]+" ");
        }
    }
}
public class L5P1 {
    public static void main(String[] args) {
        Queue q=new Queue(10);
        Scanner sc=new Scanner(System.in);
        try {
            for (int i = 0; i < 11; i++) {
                q.Enqueue(sc.nextInt());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        q.Display();
        System.out.println();
        
        Queue q1=new Queue(10);
        try {
            q1.Dequeue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
