
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("java");
        s.add("oop");
        s.add("comparator");
        s.add("arraylist");

        Comparator<String> com=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };

        Collections.sort(s,com);

        System.out.println(s);
    }
}
