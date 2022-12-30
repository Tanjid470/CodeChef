
package CodeChef;

import java.util.Scanner;

public class Alternate {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int d=b-a;
            if(d%3==0 || d%3==1){
                System.out.println("Yes");                
            }
            else{
                System.out.println("No");                
            }
           
        }
    }
}

