class WashingMachine{
    public void SwitchOn(){
        System.out.println("Switching on...");
    }
    public int AcceptCloths(int n){
        System.out.println("Accepting "+n+" Cloths...");
        return n;
    }
    public void AccectDetergent(){
        System.out.println("Acceptin Detergent...");
    }
    public void SwitchOff(){
        System.out.println("Switching Off...");
    }
}
public class L6P3 {
    public static void main(String[] args) {
        WashingMachine w=new WashingMachine();
        w.SwitchOn();
        System.out.println(w.AcceptCloths(10));
        w.AccectDetergent();
        w.SwitchOff();
}
}
