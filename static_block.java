class Mobile{
    String brand;
    int price;
    String network;
    static String name;
    static {
        name="Phone";
        System.out.println("in static block");
    }
    public Mobile(){
        brand="";
        price=200;
        name="Phone";
        System.out.println("in constructor");
    }
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class static_block {
    public static void main(String [] args){
        Class.forname("Mobile");
       // Mobile obj1=new Mobile();
        /* 
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="SmartPhone";
        Mobile obj2=new Mobile();
        */
       /*
       Camel casing
       class and interface -Calc (first letter capital)
       variable and method - marks,show() (small letter)
       constants -PIE,BRAND (all capital)

       showMyMarks() (first letter of each word is capital from second word)
       
       */
    }
    
}
