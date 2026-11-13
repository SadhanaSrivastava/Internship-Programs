package Week_2;

import java.util.Scanner;
public class SecondLargest_Element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +n+" Elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == max1)
                 continue;

            if(arr[i] > max1) {
                 max2 = max1;
                 max1 = arr[i];
             }
             else if (arr[i] > max2)
                 max2 = arr[i];
        }
       System.out.println("Second Largest Element is : "+max2);
    }
}
