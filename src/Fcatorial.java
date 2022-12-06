public class Fcatorial {
   static int cal=1;
    public static void main(String[] args) {
        int num=5;

        System.out.println(fact(num));



//        for (int i = 1; i <=3 ; i++) {
//            fact=fact*i;
//        }
//        System.out.println(fact);
    }
   static int fact(int num){
        if (num==0){
            System.out.println("1");
        }
        else
//            return num*fact(num-1);

              cal=cal*num;
        fact(num-1);
return cal;
    }
}
