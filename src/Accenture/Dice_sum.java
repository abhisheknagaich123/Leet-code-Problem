package Accenture;

public class Dice_sum {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=6 ; j++) {
                if (i+j==n){
                    System.out.println(i+"+ "+j);
                   count++;
                }
            }
        }
        System.out.println(count);
    }
}
