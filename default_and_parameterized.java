class Human{
    private int age;
    private String name;
    public Human(){
        age=12;
        name="John";
        System.out.println(age+","+name);
    }
    public Human(String name){
        this.name=name;
        System.out.println(name);
    }
    public Human(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println(name+","+age);
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
public class default_and_parameterized {
    public static void main(String [] args){
        Human obj=new Human();
        Human obj1=new Human("Sumit");
        Human obj2=new Human(28,"Sumit");

    }
}

