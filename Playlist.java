
package CodeChef;

import java.util.Scanner;


public class Playlist {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int count=0;
        while(t-->0){
            int x=input.nextInt();
            int y=input.nextInt();
            int m=y*3;
            int k=x/m;
              
            System.out.println(k);            
        }
    }
    
}
