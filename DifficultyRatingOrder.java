
package CodeChef;

import java.util.Scanner;


public class  DifficultyRatingOrder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t;
      
       
        t=input.nextInt();
        int[] n=new int[t];
        int[][] dif=new int[t][10];
        for (int i = 0; i < t; i++) {
        n[i]=input.nextInt();
            for (int j = 0; j < n[i]; j++) {
                dif[i][j]=input.nextInt();
            } 
        }
      
        for (int i = 0; i < t; i++) { 
            int[] count=new int[n[i]];
            for (int j = 0; j < n[i]; j++) {
              if(dif[i][j]>dif[i][j+1]){
                  if(j==n[i]-1){
                      
                  }else{
                         count[i]++; 
                  }
              
              }                  
            } 
           if(count[i]>0){
               System.out.println("No");                
           } 
           else{
               System.out.println("Yes");               
           }
        }
    }
    
}

                      //  Formula 2

//package CodeChef;
//
//import java.util.Scanner;
//
//
//public class Test {
//    
//    public static boolean check(int arr[]){
//        int last=0;
//        for (int i = 0; i < arr.length; i++) 
//        {
//            if(arr[i]<last)
//            {
//                return false;
//            }
//            last = arr[i];
//        }
//        return true;
//    }
//    
//    public static void main(String[] args) throws java.lang.Exception {
//        Scanner input=new Scanner(System.in);
//        int t=input.nextInt();
//        while(t-->0){
//            int a=input.nextInt();
//            int arr[]=new int[a];
//            for (int i = 0; i < a; i++) {
//                arr[i]=input.nextInt();
//                
//            }
//            if(check(arr)){
//                System.out.println("Yes");                 
//            }
//            else{
//                System.out.println("No");                
//            }
//        }
//    }
//    
//}
//
//
//   
//
