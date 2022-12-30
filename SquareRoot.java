
package CodeChef;

import java.util.Scanner;
import java.lang.Math;


public class SquareRoot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] value=new int[100];
        for (int i = 0; i < n; i++) {
            value[i]=input.nextInt();
            System.out.println((int)Math.sqrt(value[i]));            
            
        }
    }
    
}

