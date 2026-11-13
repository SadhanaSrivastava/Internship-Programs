package Week_2;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros_End {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            int count = 0;
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] != 0)
                {
                    int temp = arr[count];
                    arr[count] = arr[j];
                    arr[j] = temp;

                    count++;
                }
            }
            System.out.print("New Array is : "+Arrays.toString(arr));
        }
}
