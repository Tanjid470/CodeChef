
package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0)
        {
            int i=0;
            int n=input.nextInt();
            int[] ar=new int[n];
            int[] max=new int[n];
            for (i = 0; i < n; i++)
            {
                ar[i]=input.nextInt();
            }
            int max2;
            max2 = 0;
            for (i = 0; i < n; i++) {
                ar[i]=ar[ar.length];
                int m=ar[i];
                System.arraycopy(ar, 0, ar, 1, n-1);
                max[i] = m+ar[ar.length];
                while(i != ar.length){
                       if(max2<max[i]){
                       max2=max[i];
                }
                }
             
            }
            System.out.println(max2);            
        }
    }
}
