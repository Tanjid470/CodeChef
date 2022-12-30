
package CodeChef;

import java.util.Scanner;

public class It_IsMyServe {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int x=input.nextInt();
            int y=input.nextInt();
            int m=(x+y)%4;
            if(m<2){
            
                System.out.println("Alice");
                          
            }
            else{
                System.out.println("Bob");                
                  
            }
        }
    }
}
