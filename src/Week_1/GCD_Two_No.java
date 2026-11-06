package Week_1;

import java.util.Scanner;
public class GCD_Two_No {
    static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter first number ->");
        int a = sc.nextInt();
        System.out.println("Enter second number ->");
        int b = sc.nextInt();
        int n = a < b ? a : b ;
        while ( true )
        {
            if( a % n == 0 && b % n == 0 )
                break;
            n--;
        }
        System.out.println( " GCD of "+ a +" and "+ b +" is "+ n );
    }
}
