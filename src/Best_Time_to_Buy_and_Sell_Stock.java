public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int a[] = {7, 1, 5, 3, 6, 4};
        int maxprofit = 0;//4 ,2,
        int maxvalu=Integer.MAX_VALUE;
        int buy_price=a[0];//7 , 1 ,  5 ,
        for (int i = 1; i <a.length ; i++) {
            if (buy_price>a[i]){//1>5
                buy_price=a[i];
            }
            else {
                int current_profit=a[i]- buy_price;
                  maxprofit=Math.max(maxprofit,current_profit);
            }
        }
        System.out.println(maxprofit);

    }

}
//    int bp= Integer.MAX_VALUE;
//    int maxprofit= 0;
//
//        for(int i=0; i< prices.length; i++){
//        if( bp < prices[i]){
//        int profit= prices[i] - bp;
//        maxprofit = Math.max(maxprofit, profit);
//        }
//        else{
//        bp= prices[i];
//        }
//        }
//        return maxprofit;