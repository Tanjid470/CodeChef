
package CodeChef;

import java.util.Scanner;


public class Possible_GCD {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0)
        {
          int x=input.nextInt();
          int y=input.nextInt();
          int n=Math.abs(x-y);
           int co=0;
            for ( int i = 1; i <= (int)Math.sqrt(n); i++)
            {
               if(n%i==0)
               {
                   if(n/i==i)
                    {
                    co++; 
                    }
                    else
                    {
                    co+=2;
                    }
               } 
              
            }
            System.out.println(co);            
        }
    }
    
}
