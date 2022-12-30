
package CodeChef;

import java.util.Scanner;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int[][] n=new int[t][3];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                Arrays.sort(n[i]);
                              
            }
            System.out.println(n[i][1]);  
        }
    }
    
}
