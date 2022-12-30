
package CodeChef;

import java.util.Scanner;

public class ChairsRequirments {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            if(a<=b){
                System.out.println(0);                
            }
            else
            {
                System.out.println(Math.abs(b-a));                
            }
        }
    }
    
}
