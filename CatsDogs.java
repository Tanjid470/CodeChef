
package CodeChef;

import java.util.Scanner;


public class CatsDogs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int c=input.nextInt();
            int d=input.nextInt();
            int l=input.nextInt();
        
                   int check=l-d*4;
                   if(check%4==0){
                       if(d*4<=l)
                       System.out.println("yes");
                       else
                            System.out.println("no");
                           
                   }
                   else{
                       System.out.println("no");
                   }
            }
            
           
        }
   
    
}
