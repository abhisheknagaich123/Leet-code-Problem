public class Fibonicci {
  static   int a=0;
    static int b=1;
    static int c;
    public static void main(String[] args) {
int num=10;
        System.out.print(a+" ");
        System.out.print(b+" ");

//        for (int i = 1; i <=10 ; i++) {
//          c=a+b;
//            System.out.print(c+" ");
//            a=b;
//            b=c;
//        }
        fibo(num-2);
    }
    static void fibo(int num){
      if (num>0){
          c=a+b;

          a=b;
          b=c;
          System.out.print(c+" ");
          fibo(num-1);
      }
    }
}
