
import java.util.HashSet;

class Person{
    int age;
    int weight;
    public Person(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", weight=" + weight + "]";
    }
    
    @Override
    public int hashCode(){
        String strAge=String.valueOf(age);
        String strWeight=String.valueOf(weight);

        return strAge.hashCode()+strWeight.hashCode();
    }

    @Override
    public boolean equals(Object o){
        Person that=(Person)o;
        return (that.age==this.age && that.weight==this.weight);
    }

}
public class hashSetDemo {
    public static void main(String[] args) {
        HashSet<Person> set=new HashSet<>();
        set.add(new Person(18, 70));
        set.add(new Person(18, 70));
        set.add(new Person(19, 60));
        set.add(new Person(14, 40));
        System.out.println(set);
    }
}
