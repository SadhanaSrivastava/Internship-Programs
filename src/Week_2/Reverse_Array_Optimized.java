package Week_2;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array_Optimized {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        int i = 0;
        int j = arr.length - 1;

        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        System.out.println("Reversed array is : \n"+ Arrays.toString(arr));
    }
}
