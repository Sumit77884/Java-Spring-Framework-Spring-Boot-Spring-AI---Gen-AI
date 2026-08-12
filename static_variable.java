class Mobile{
    String brand;
    int price;
    String network;
    // String name;
    static String name;
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class static_variable {
    public static void main(String [] args){
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        obj1.name="SmartPhone";
       // Mobile.name="SmartPhone1";
        obj1.show();


    }
}
