
package CodeChef;

import java.util.Scanner;


public class DivisiblesBy_i {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int t=input.nextInt();
       while(t-->0)
       {
           int n=input.nextInt();
           int k=0;
           int[] ar=new int[n];
           k=n;
           ar[n-1]=n;
           for (int i = 1; i <n; i++) 
           {
              
                 if(i%2 != 0){
                        ar[n-1-i]=k-(n-i);
                        k=ar[n-1-i];
                 }
                 else if(i%2 == 0){
                         ar[n-1-i]=k+(n-i);
                         k=ar[n-1-i];
                 }  
           }
           for (int i = 0; i < n; i++) {
               System.out.print(""+ar[i]+" ");               
           }
           System.out.println("");           
       }
    }
    
}
