package Week_2;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_DupElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = 1;

        if(arr.length == 0)
            return;
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        System.out.print("Unique Elements are : ");
        for(int a = 0; a <= i; a++)
        {
            System.out.print(arr[a]+" ");
        }
    }
}
