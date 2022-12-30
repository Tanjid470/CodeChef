
package CodeChef;

import java.util.Scanner;


public class WhatsApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
       int[] x=new int[t];
       int[] y=new int[t];
       int[] z=new int[t];
       int[] m=new int[t]; 
        for (int i = 0; i < t; i++) {
           x[i]=input.nextInt();
           y[i]=input.nextInt();
           z[i]=input.nextInt();
        }
        for (int i = 0; i < t; i++) 
        {
          m[i]=(x[i]-y[i])*z[i];
            System.out.println(m[i]);            
            
        }
        
    }
    
}
