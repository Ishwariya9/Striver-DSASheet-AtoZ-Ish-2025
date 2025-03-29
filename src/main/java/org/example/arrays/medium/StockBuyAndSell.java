package org.example.arrays.medium;

import java.util.Scanner;

public class StockBuyAndSell {
    public static void main(String[] args) {
        /*prices = [7,1,5,3,6,4]
Output:
 5
Explanation:
 Buy on day 2 (price = 1) and
sell on day 5 (price = 6), profit = 6-1 = 5.
*/

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int profit=Integer.MIN_VALUE;
        int min=arr[0];
        for(int i=1;i<n;i++) {
            profit=Math.max(profit,arr[i]-min);
            min = Math.min(min,arr[i]);
        }
        System.out.println("Profit:" + profit);
    }
}
