package Week_1;

import java.util.Scanner;
public class Fibonacci_Series {
    static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the terms ->");
        int n = sc.nextInt();
        int first = 0 ;
        int second = 1 ;
        int terms = 1 ;
        while ( terms <= n ) {
            System.out.print(first + " ");
            int third = first + second;
            first = second;
            second = third;
            terms++;
        }
    }
}
