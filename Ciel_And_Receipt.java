
package CodeChef;

import java.util.Scanner;


public class Ciel_And_Receipt {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int count=0;
            long note=input.nextInt();
            int[] a={2048,1024,512,256,128,64,32,16,8,4,2,1};
            for (int i = 0 ; i <= a.length-1; i++) 
            {
                count+=(note/a[i]);
                note=note%a[i]; 
            }
            System.out.println(count);
        }
        System.exit(0);        
    }
}
