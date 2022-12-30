
package CodeChef;

import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
          float a,b;
          a=input.nextFloat();
          b=input.nextFloat();
          float m= (float) (b-a-0.5);
          if(a%5==0 && m>=0){
              System.out.printf("%.2f\n",m);              
          }
          else{
              System.out.printf("%.2f\n",b);              
          }
    }
    
}
