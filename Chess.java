
package CodeChef;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class Chess {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int[] ar=new int[4];
        while(t-->0){
            for (int i = 0; i < 4; i++) {
                ar[i]=input.nextInt();
            }
            int x=ar[0]-ar[2];
            x=x*x;
            int y=ar[1]-ar[3];
            y=y*y;
            int m=(int)sqrt(x+y);
            
            if(ar[0]%2==0 && ar[1]%2==0)
                    {
                      if(ar[2]%2==0 && ar[3]%2==0)  {
                          if(m==4){
                              System.out.println("Yes");                              
                          }
                          else{
                          System.out.println("No");                          
                          }
                      }
                      else if(ar[2]%2==1 && ar[3]%2==1){
                         if(m==4){
                              System.out.println("Yes");                              
                          }
                          else{
                          System.out.println("No");                          
                          }                         
                      }
                    }
            else if(ar[0]%2==1 && ar[1]%2==1){
                
                 if(ar[2]%2==1 && ar[3]%2==1)  {
                        if(m==4){
                              System.out.println("Yes");                              
                          }
                          else{
                          System.out.println("No");                          
                          }                         
                      }
                 else if(ar[2]%2==0 && ar[3]%2==0){
                          if(m==4){
                              System.out.println("Yes");                              
                          }
                          else{
                          System.out.println("No");                          
                          }                         
                      }  
             }
            else{
                System.out.println("No");                
            }
        }
    }
    
}
