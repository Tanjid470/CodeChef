
package CodeChef;

import java.util.Scanner;


public class DetermineTheScore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int x=input.nextInt();
            int y=input.nextInt();
            int m=x/10;
            System.out.println(m*y);            
            
        }
    }
}
