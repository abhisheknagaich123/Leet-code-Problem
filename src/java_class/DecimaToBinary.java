package java_class;

public class DecimaToBinary {
    public static void binarytodecimal(int Binanryno){
        int decimal=0;
        int pow=0;
        while (Binanryno!=0){
            int rem=Binanryno%10;
            decimal=decimal+(rem*(int) Math.pow(2,pow));
            pow++;
            Binanryno/=10;

        }
        System.out.println(decimal);
    }
    public static void decimaltobinary(int dcimalno){
        int decimal=0;
        int pow=0;
        while (dcimalno!=0){
            int rem=dcimalno%2;
            decimal=decimal+(rem*(int) Math.pow(10,pow));
            pow++;
            dcimalno/=2;

        }
        System.out.println(decimal);
    }

    public static void main(String[] args) {
        int Binanryno=111;
         binarytodecimal(Binanryno);
         decimaltobinary(7);
    }



}
