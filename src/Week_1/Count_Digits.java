package Week_1;

import java.util.Scanner;
public class Count_Digits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = n ;
        int digits = 0 ;
        while (n > 0) {
            int rem = n % 10 ;
            digits ++ ;
            n = n / 10 ;
        }
        System.out.println("Digit count of " + num + " is " + digits) ;
    }
}
