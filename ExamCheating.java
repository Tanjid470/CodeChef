
package CodeChef;

import java.util.Scanner;


public class ExamCheating {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int A=input.nextInt();
            int B=input.nextInt();
            int diff=Math.abs(A-B);
            int p=0;
            for(int i=1;i<=(int)Math.sqrt(diff);i++){
                if(diff%i==0){
                if(diff/i==i) p++;
                else p+=2;
            }
            }System.out.println(p);
        }
    }
    
}
