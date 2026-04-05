class Array3D{
    int x;
    int y;
    int z;

    public Array3D(int x,int y,int z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    
    public void set(int value,int Xindex,int Yindex,int Zindex,int[] Array1D){
        int idx=Xindex*(y*z)+Yindex*z+Zindex;
        Array1D[idx]=value;
    }

    public int get(int Xindex,int Yindex,int Zindex,int[] Array1D){
        int idx=Xindex*(y*z)+Yindex*z+Zindex;
        return Array1D[idx];
    }
}
public class P1 {
    public static void main(String[] args) {
        int[] arr1D=new int[24];
        Array3D arr3D=new Array3D(2, 3, 4);
        arr3D.set(4,1,1,1,arr1D);
        int val=arr3D.get(1,1,1,arr1D);
        System.out.println("Value[1][1][1]="+val);
    }
}
