class X{
    int i;
    int j;
    X(int a,int b){
        i=a;
        j=b;
    }
    public int finalSum(){
        return i+j;
    }
}

class Y extends X{
    Y(int a,int b){
        super(a,b);
    }
    public int finalDifference(){
        return i-j;
    }
}

class Z extends Y{
    Z(int a,int b){
        super(a,b);
    }
    public int finalProduct(){
        return i*j;
    }
}

class MultilevelInheritanceDemo extends Z{
    MultilevelInheritanceDemo(int a,int b){
        super(a,b);
    }
    public void main(){
        System.out.println("Sum= "+finalSum());
        System.out.println("Difference= "+finalDifference());
        System.out.println("Product= "+finalProduct());
    }
}
public class P3 {
    public static void main(String[] args) {
        MultilevelInheritanceDemo ml=new MultilevelInheritanceDemo(8, 5);
        ml.main();
    }
}
