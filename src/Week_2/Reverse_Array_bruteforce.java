package Week_2;
import java.util.Arrays;
import java.util.Scanner;
public class Reverse_Array_bruteforce {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        int[] revarr = new int[n];
        int j = 0;

        for( int i = arr.length-1; i >=0; i--) {
            revarr[j] = arr[i];
            j++;
        }

        for(int i = 0; i < arr.length; i++)
            arr[i] = revarr[i];
        System.out.println("Reversed array is : \n"+ Arrays.toString(arr));
    }
}
