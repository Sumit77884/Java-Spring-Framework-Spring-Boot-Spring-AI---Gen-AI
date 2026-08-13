class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}
 class AdvCalc extends Calc{
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}
public class inheritance {
    public static void main(String [] args){
        /*
        Inheritance:-
        is, has
        is is used in inheritance
        class Calc
        {
        add()
        sub()
        multi()
        div()
        }
        class AdvCal extends Calc{
        
        }
        
        */
       Calc obj=new Calc();
       System.out.println(obj.add(10,5));
       System.out.println(obj.sub(10,5));
       Calc obj1=new AdvCalc();//only parent class data and method will exicute not child
       System.out.println(obj1.sub(10,5));
    }
}
