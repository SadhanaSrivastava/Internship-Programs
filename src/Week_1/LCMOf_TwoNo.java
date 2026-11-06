package Week_1;
import java.util.Scanner;
public class LCMOf_TwoNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt();
         int lcm = a > b ? a : b;

         while( true )
         {
             if(lcm % a == 0 && lcm % b == 0) {
                 System.out.println("Lcm of these numbers is : " + lcm);
                 break;
             }
             lcm++ ;
         }
    }
}
