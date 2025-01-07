package Arrays.Easy;

// leetcode.121. Best Time to Buy and Sell Stock - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

// You are given an array prices where prices[i] is the price of a given stock on the ith day.You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class bysellstock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int ans = buysellstock(arr);
        System.out.println(ans);
    }

    // first approach (optimal solution, 0(n))
    static int buysellstock(int prices[]){
        int n = prices.length;
        int maxProfit = 0;
        int bestBuy = prices[0];
        
        for(int i=1; i<n; i++){
            if(prices[i]>bestBuy){
                maxProfit = Math.max(maxProfit, prices[i]-bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return maxProfit;
    }
}
