
package CodeChef;

import java.util.Scanner;


public class Smallest_Numbers_of_Notes {
    //static int count=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int count=0;
            long note=input.nextInt();
            int[] a={100,50,10,5,2,1};
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
