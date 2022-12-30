
package CodeChef;

import java.util.Scanner;

public class office {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
 
        int t=input.nextInt();
        while(t-->0){
        int sum=0;
        int flag=0;
            int n=input.nextInt();
            int[] A=new int[n];
        for (int i = 0; i < n; i++) 
        {
            A[i]=input.nextInt();
            if(A[i]==2){
             flag=1;   
            }
            sum=sum+A[i];
        }
        if(sum%2==0){
            System.out.println("0");}
        else if(flag==1){
            System.out.println("1");}
        else{
            System.out.println("-1");}
        }
       
    }
}
