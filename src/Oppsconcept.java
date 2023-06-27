public class Oppsconcept {
    public static void main(String[] args) {
//        pen obj=new pen();
//        obj.peninfo(4);
//        obj.color="black";
//        obj.type="pen";
//        pen obj2=new pen();
//        obj2.color="2black";
//        obj2.type="ball pen";
//        obj.printinfo();
//        obj2.printinfo();
//        Triangel t1 = new Triangel();
//        t1.dipsplayarea();
//        t1.dipsplayarea();
//        t1.dipsplayarea(5,5);
        EquilateralTriangle eq1=new EquilateralTriangle();
        eq1.dipsplayarea();
        eq1.dipsplayarea(5,6);
        eq1.area();

    }
}

class pen{
    String color;
    String type; //gel ya ball pen
//    public void write(){
//        System.out.println("this is pen clASS");
//    }
//    public void printinfo(){
//        System.out.println(this.color);
//        System.out.println(this.type);
//    }
//    pen(){
//        System.out.println("this is a constructer");
//    }
    void peninfo(String name){
        System.out.println("this is pen name"+name);
    }
    void peninfo(int price){
        System.out.println("this is pen price"+price);
    }
    void peninfo(String name, int price){
        System.out.println("this is pen price and name both"+name+" "+price);
    }
}

class shape{
    void dipsplayarea(){
        System.out.println("display area");
    }
}
class Triangel extends shape{

    void dipsplayarea(int l,int h){
        System.out.println((l*h)/2);
    }
}
class EquilateralTriangle extends Triangel{
    void area(){
        System.out.println("this is EquilateralTriangle");
    }
}