package Week_2;

import java.util.Scanner;

public class Smallest_Element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements : ");

        for( int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest element : "+min);
    }
}
