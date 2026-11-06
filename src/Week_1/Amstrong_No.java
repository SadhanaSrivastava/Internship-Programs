package Week_1;

import java.util.Scanner;

public class Amstrong_No {
    static void main(String[] args) {
        Scanner sc = new Scanner( System.in ) ;
        System.out.println(" Enter the numbers ") ;
        int n = sc.nextInt();
        int num = n ;
        int count = 0;
        int sum = 0;
        while( n > 0 )
        {
            count++;
            n = n / 10;
        }
        n = num;

        while( n > 0 )
        {
            sum += (int)Math.pow(n % 10,count);
            n = n / 10;
        }
        if ( sum == num )
            System.out.println( num + " is an Amstrong Number") ;
        else
            System.out.println( num + " is not an Amstrong Number") ;

    }
}
