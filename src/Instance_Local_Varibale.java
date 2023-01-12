public class Instance_Local_Varibale {
    String carname;
    int carno;    // this is instance variable
    public void carinfo(String name,int number){
             name=this.carname;
             number=this.carno;

    }

    public static void main(String[] args) {
        Instance_Local_Varibale obj=new Instance_Local_Varibale();
        obj.carinfo("bmw",123);

    }

}
