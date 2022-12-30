
package CodeChef;

import java.util.Scanner;

public class WireFrame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int w=input.nextInt();
            int x=input.nextInt();
            int y=input.nextInt();
            int z=input.nextInt();
            int to=(x-y)*z;
            System.out.println(w+to);
           
        }
    }
    
}
