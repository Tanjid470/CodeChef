
package CodeChef;

import java.util.Arrays;
import java.util.Scanner;


public class Bomb_the_base {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0)
        {
           int house=input.nextInt(); 
           int power=input.nextInt();
           
           int[] a=new int[house];
            for (int i = 0; i < house; i++) 
            {
                a[i]=input.nextInt();  
            } int count = 0; 
            for (int i = house-1; i >=0; i--) 
            {
                if(a[i]<power){
                   count=i+1; 
                   break;
                }
            }
            System.out.println(count);
        }
        System.exit(0);        
    }
    
}
