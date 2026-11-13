package Week_2;

import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position : ");
        int pos = sc.nextInt();
        rotateArray(arr, pos);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }


    static void rotateArray(int[] arr, int pos) {
        int n = arr.length;

        pos %= n;

        reverse(arr,0, pos - 1);

        reverse(arr, pos, n - 1);

        reverse(arr, 0, n - 1);
    }

    // Function to reverse a portion of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}

