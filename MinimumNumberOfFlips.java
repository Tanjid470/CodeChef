package CodeChef;

import java.util.Scanner;


public class MinimumNumberOfFlips {
    
        public static int Rec(int A,int B)
        {
              int count = 0;
              
               if(A%3==0 || B%3==0) {
                 return 0;
               }
               else{
                   
                   A=Math.abs(A-B);
                   count++;
                   if(A%3==0){
                       return count;
                   }
                   B=Math.abs(A-B);
                   count++;
                   if(B%3==0){
                     return count;
                   }
                   else{
                           
                   return count+Rec(A,B);
                   }
               
               }           
     
        }
    
    
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int testCase=input.nextInt();
        int A,B,result;
        

        
        
        while(testCase-->0){
           A=input.nextInt();
           B=input.nextInt();
           if(A%3==0 || B%3==0){
               System.out.println("0");               
           }
           else{
               result=Rec(A,B);
               System.out.println(result);                          
           }
            
        }
    }
    
}
