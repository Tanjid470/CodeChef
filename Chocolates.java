
package CodeChef;

import java.util.Arrays;
import java.util.Scanner;


public class Chocolates {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int TestCase=input.nextInt();
       while(TestCase-->0)
       {
       int ar[]=new int[4];
       int i,Pa = 0,Qa = 0;
           for (i = 0; i < 4; i++) {
               ar[i]=input.nextInt();
           }
           if(ar[i]<ar[i+1]){
              Pa=ar[i+1];
           }
          else if(ar[i]>=ar[i+1]){
           Pa=ar[i];
           }
          else if(ar[i+2]<ar[i+3]){
           Qa=ar[i+1];
           }
          else if(ar[2]>=ar[i+3]){
           Qa=ar[i];
           }
          else if(Pa==Qa){
               System.out.println("TIE");               
          }
           
     
         
  
       }
     }
    
}
