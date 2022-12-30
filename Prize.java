
package CodeChef;

import java.util.Scanner;

public class Prize {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int testCase=input.nextInt();
        int top=10,st=90;
        int[] arr=new int[testCase];
        int[] arr2=new int[testCase];
        for (int i = 0; i < testCase; i++) {  
            arr[i]=input.nextInt();
            arr2[i]=input.nextInt();   
        }
        for (int i = 0; i < testCase; i++) {
            int[] prize=new int[testCase];
                   prize[i]= arr[i]*10+arr2[i]*90;
            System.out.println(prize[i]);            
            
        }
    }
    
}
