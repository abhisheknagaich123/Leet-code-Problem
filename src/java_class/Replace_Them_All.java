package java_class;

import java.util.Scanner;

public class Replace_Them_All {
     int replaceZeroWithFive(int num) {
        if (num == 0) {
            return 5;
        }

        int result = 0;
        int placeValue = 1;

        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                digit = 5;
            }
            result += digit * placeValue;
            num /= 10;
            placeValue *= 10;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        Replace_Them_All obj= new Replace_Them_All();
        int t=obj.replaceZeroWithFive(num);
        System.out.println(t);


    }
}
