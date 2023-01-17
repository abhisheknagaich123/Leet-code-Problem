public class maxScore1423 {
    public static void main(String[] args) {
        int  cardPoints[]   = {1,2,3,4,5,6,1};
        int k = 3;
        int sum1=0;
        int sum2=0;
        for (int i = 0; i <k ; i++) {
            sum1+=cardPoints[i];
        }
        for (int i = 0; i <k ; i++) {
            sum2+=cardPoints[cardPoints.length-i-1];
        }

        System.out.println(Math.max(sum1,sum2));

    }
}
