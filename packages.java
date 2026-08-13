// Import Java's built-in ArrayList
import java.util.ArrayList;

public class packages {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        
        Calc obj = new Calc();
        AdvCalc obj1 = new AdvCalc();
        A obj2 = new A();
        
        // Added some print statements to prove it works
        System.out.println("Basic Calc Add: " + obj.add(10, 5));
        System.out.println("Adv Calc Multiply: " + obj1.multi(10, 5));
        System.out.println("Adv Calc Inherited Add: " + obj1.add(10, 5));
    }
}