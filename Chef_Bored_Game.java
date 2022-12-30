
package CodeChef;

import java.util.Scanner;


public class Chef_Bored_Game {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int N=input.nextInt();
            int sum=0;
            for(int k=1;k<=N;k+=2){
                sum=sum+(N-k+1)*(N-k+1);
            }
            System.out.println(sum);
        }
    }
}
