class Parent{
    String s;
    Parent(String s){
        this.s=s;
    }
    public void printString(){
        System.out.println("This String is from Parent: "+s);
    }
}

class Child extends Parent{
    String s1;
    Child(String s,String s1){
        this.s1=s1;
        super(s);
    }
    public void printString(){
        super.printString();
        System.out.println("This String is from Child: "+s1);
    }
}
public class L6P2 {
    public static void main(String[] args) {
        Child c=new Child("Parent","Child");
        c.printString();
    }
}
