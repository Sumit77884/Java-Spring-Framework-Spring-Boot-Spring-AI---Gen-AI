class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}
class AdvCalc extends Calc
{
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}
class VaryAdvCalc extends AdvCalc{
    public double power(int n1,int n2){
        return Math.pow(n1,n2);
    }
}
public class multipleInheritance {
    public static void main(String [] args){
        Calc obj=new Calc();
        AdvCalc obj1=new AdvCalc();
        VaryAdvCalc obj3=new VaryAdvCalc();
        int r1=obj.add(4,5);
        int r2=obj.sub(10,5);
        int r3=obj1.multi(7,9);
        int r4=obj1.add(4,5);
        int r5=obj1.sub(10,5);
        int r6=obj3.add(2,7);
        int r7=obj3.sub(10,5);
        int r8=obj3.multi(7,9);
double   r9=obj3.power(2,5);
System.out.println(r1+" :"+r2+":");
System.out.println(r3+":"+r4+":"+r5);
System.out.println(r6+":"+r7+":"+r8+":"+r9);

    }
}
