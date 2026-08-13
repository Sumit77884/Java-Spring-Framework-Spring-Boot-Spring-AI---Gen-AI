class A{
    public A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("In A Show");
    }
}
public class anonymousObject{
    public static void main(String [] args){
        int marks;
        marks=99;   //anonymous object
        new A();
        new A().show();
       // A obj=new A();
        A obj;
       obj=new A();
      obj.show();


    }
}