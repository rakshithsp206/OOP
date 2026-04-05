class Employee{
    String name;
    String lastname;
    double salary;

    public Employee(String n,String ln,double sal){
        name=n;
        lastname=ln;
        salary=sal;
    }
    
    public void setSalary(double sal){
        salary=sal;
    }

    public double getsalary(){
        return salary;
    }

    public void getAll(){
        System.out.println("Full Name: "+name+" "+lastname);
        System.out.println("Monthly Salary = "+salary);
    }
}

public class P3 {
    public static void main(String[] args) {
        Employee emp1=new Employee("Girish","Bhadary", 56000);
        Employee emp2=new Employee("Satvik","Rai",34000);
        emp1.getAll();
        System.out.println("Yearly Salary="+12*emp1.getsalary());
        System.out.println(" ");
        emp2.getAll();
        System.out.println("Yearly Salary="+12*emp2.getsalary());

        emp1.setSalary(1.1*emp1.getsalary());
        emp2.setSalary(1.1*emp2.getsalary());
        System.out.println("\nAfter 10% hike-");
        emp1.getAll();
        emp2.getAll();
    }

}
