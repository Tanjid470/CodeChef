
package CodeChef;

import java.util.Scanner;


public class ScoreHigh {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int t=input.nextInt();
        
        int[] n=new int[4];
    for (int j = 0; j < t; j++) 
    {
    int N=input.nextInt();
        for (int i = 0; i < 4 ; i++)
        {
            n[i]=input.nextInt();
            sum=sum+n[i];
        }
        int max=n[0];
       
             for (int i = 0; i < 4; i++)
            {
             if (max<n[i]) 
                {
                max=n[i];
                } 
            }            
        

        System.out.println(max); 
    }
  }  
}
