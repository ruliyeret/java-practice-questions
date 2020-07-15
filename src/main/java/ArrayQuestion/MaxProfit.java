package ArrayQuestion;


/**
 Say you have an array for which the ith element is the price of a given stock on day i.

 If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 Note that you cannot sell a stock before you buy one.

 Input: [7,1,5,3,6,4]
 Output: 5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 Not 7-1 = 6, as selling price needs to be larger than buying price.

 */
public class MaxProfit {


    public static int getMaxProfit(int[] prices){

        int currentPrice = Integer.MAX_VALUE;
        int difference = 0;
        for (int  priceDay: prices){
            if(priceDay < currentPrice){
                currentPrice = priceDay;
            }else{
                difference = Math.max( priceDay - currentPrice, difference);
            }

        }

        return difference;
    }
    public static void main(String[] args) {

        int[] test1 = {7,1,5,3,6,4};
        System.out.println("The max profit is " + getMaxProfit(test1));
        int[] test2 = {7,6,4,3,1};
        System.out.println("The max profit is " + getMaxProfit(test2));

//        int[] test3 = {7,1,5,3,6,4};

    }
}
