
package CodeChef;

import java.util.Arrays;
import java.util.Scanner;


public class Janmansh_at_Fruit_Market {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int Total=input.nextInt();
            int[] a=new int[3];
            
            for (int i = 0; i < 3; i++) {
                a[i]=input.nextInt();
            }
            Arrays.sort(a);
            int rslt=((Total-1)*a[0])+ a[1];
            System.out.println(rslt);
        }
        System.exit(0);        
    }
}
