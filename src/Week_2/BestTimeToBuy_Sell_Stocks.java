package Week_2;

import java.util.Scanner;

public class BestTimeToBuy_Sell_Stocks {
    static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the length of the array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the "+n+" stock prices : ");
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int minPrice = arr[0];
            int maxProfit = 0;

            for(int i = 1; i < arr.length; i++) {

                if(arr[i] < minPrice) {
                    minPrice = arr[i];
                }

                int profit = arr[i] - minPrice;

                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }

            System.out.println("Best stock price to buy is "+minPrice+" \nMaximum Profit: " + maxProfit);
        }
}
