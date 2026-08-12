class Human{
private int age;
private String name;
public Human(){
    age=12;
    name="John";
    System.out.println("In Construct");
}
public int getAge(){
    return age;
}
public void setAge(int age){
    this.age=age;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
}
public class constructor{
    public static void main(String [] args){
        Human obj =new Human();
        Human obj1=new Human();
        System.out.println(obj.getName()+":"+obj.getAge());
        obj.setName("Reddy");
        obj.setAge(30);
        System.out.println(obj.getName()+":"+obj.getAge());

    }
}