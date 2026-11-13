package Week_2;

import java.util.Arrays;
import java.util.Scanner;

public class Two_sums {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value : ");
        int target = sc.nextInt();

        if (twosum(arr, target))
            System.out.println("Sum is present");
        else
            System.out.println("Sum is not present");
    }

    static boolean twosum(int[] arr, int target) {
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target)
                return true;
            else if (sum < target)
                i++;
            else
                j--;
        }
        return false;
    }
}

