package Week_1;

import java.util.Scanner;
public class Palindrome_No {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();;
        int num = n ;
        int rev = 0 ;
        while( n > 0 )
        {
           int rem = n % 10 ;
           rev = rev * 10 + rem ;
            n = n / 10 ;
        }
        if ( rev == num )
            System.out.println( num +" is a Palindrome Number");
        else
            System.out.println( num + " is not a Palindrome Number");
    }
}
