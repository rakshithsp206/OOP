
abstract class BaseClass {
    
    public void debug() {
        System.out.println("Debugging: " + this.getClass().getName());
    }

    
    public abstract void execute(); 
}


class User extends BaseClass {
    @Override
    public void execute() {
        System.out.println("Executing User class logic...");
    }
}


class Product extends BaseClass {
    @Override
    public void execute() {
        System.out.println("Executing Product class logic...");
    }
}


class Order extends BaseClass {
    @Override
    public void execute() {
        System.out.println("Executing Order class logic...");
    }
}


public class L7P5 {
    public static void main(String[] args) {
        BaseClass[] classes = {
            new User(),
            new Product(),
            new Order()
        };

        
        for (BaseClass obj : classes) {
            obj.debug();   
            obj.execute(); 
        }
    }
}

