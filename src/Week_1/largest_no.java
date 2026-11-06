package Week_1;

import java.util.Scanner;
public class largest_no {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ( a == b && b == c )
            System.out.println(" All Numbers are Same");
         else if(a >= b && a >= c)
             System.out.println(" Largest no is " + a);
         else if (b >= a && b >= c)
             System.out.println(" Largest no is " + b);
         else
             System.out.println(" Largest no is " + c);

    }
}
