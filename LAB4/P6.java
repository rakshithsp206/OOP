interface Function{
    int evacuate(int n);
}
class Half implements Function {
    public int evacuate(int n){
        return n/2;
    }
}
class Client{
    Half num=new Half();
    public int[] HalfArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=num.evacuate(arr[i]);
        }
        return arr;
    }
}
public class P6 {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        Client c=new Client();
        int[] newArr=c.HalfArray(arr);

        for(int i:newArr){
            System.out.print(i+" ");
        }
    }
}
