--Time: 1 ms
    
package arrays;

import java.util.Scanner;

public class BUY_SELL__STOCK {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);

        System.out.println("Maximum Profit = " + result);

        sc.close();
    }
}

--Time: 2 ms
    
class Solution {
    
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int profit = 0;
        int buy_price = prices[0];

        for (int i = 1; i < n; i++) {

            if (prices[i] < buy_price) {
                buy_price = prices[i];
            }

            int curprof = prices[i] - buy_price;

            if (curprof > profit) {
                profit = curprof;
            }
        }

        return profit;
    }
}


