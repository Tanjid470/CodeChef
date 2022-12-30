package CodeChef;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k=input.nextInt();
            int[] a=new int[n];
            int flag=0;
            for (int i = 0; i < n; i++) {
               a[i]=input.nextInt();
               if(a[i]==k && i!=n-1){
                   flag=1;
               }
            }
            if(n==1 && k==a[0]){
                System.out.println("Yes");
            }
            else if(flag==0)
                System.out.println("No");
            else System.out.println("Yes");
        }

        System.exit(0);
    }

}
