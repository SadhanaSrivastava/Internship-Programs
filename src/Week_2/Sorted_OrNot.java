package Week_2;

import java.util.Scanner;

public class Sorted_OrNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        int i = 0;
        int j = i + 1;
        boolean flag = true;

        while(j < arr.length)
        {
            if(arr[i] > arr[j]){
                flag = false;
                break;
            }
            else{
                i++;
                j++;
            }
        }
        if(flag){
            System.out.println("Array is Sorted");
        }
        else
            System.out.println("Array is not Sorted");
    }
}
