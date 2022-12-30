
package CodeChef;

import java.util.Scanner;


public class Daily1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int a,b;
        while(t-->0){
            int x=input.nextInt();
            int y=input.nextInt();
            if(x>=y){
                System.out.println(0);                
            }
            else{
                a=(y-x)/8;
                b=(y-x)%8;
                if(b==0)
                    System.out.println(a);  
                else
                    System.out.println(a+1);                
            }
        }
    }
    
}
