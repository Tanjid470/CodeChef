
package CodeChef;

import java.util.Scanner;


public class PRACTICEPERF {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] p=new int[4];
          int count=0;
        for (int i = 0; i < p.length; i++) {
            p[i]=input.nextInt();    
        }
        
        for (int j = 0; j < p.length; j++) {
         
           if(p[j]>=10){
               count++;       
           }
        }
        System.out.println(count);        
    }
    
}
