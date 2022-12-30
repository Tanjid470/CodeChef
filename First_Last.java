
package CodeChef;

import java.util.Arrays;
import java.util.Scanner;


public class First_Last {
    
	   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
               int t = input.nextInt();
               while (t-- > 0) {
                   int amount=input.nextInt();
                   double check= Math.sqrt(amount);
                   
                   System.out.println(check);
                   
               }
             
        System.exit(0);        
    }
}
