public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        int maxprofit=0;
        int minsofar=a[0];
        for (int i = 0; i <a.length ; i++) {
            minsofar=Math.min(minsofar,a[i]);
            int profit=a[i]-minsofar;
            maxprofit=Math.max(profit,maxprofit);
        }
        System.out.println(maxprofit);
    }
}
