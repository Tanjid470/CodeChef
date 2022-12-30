
package CodeChef;

import java.util.Arrays;
import java.util.Scanner;


public class frequencyArray {
public static void mostFrequent(int[] arr, int n)
  {
    int[] count =new int[n];
    for (int i = 0; i < n; i++) {
    
      count[i]=0;
      for (int j = 0; j < n; j++) {
        if (arr[i] == arr[j]) {
          count[i]++;
        }
      }
      
//      if (count[i] > maxcount) {
//        maxcount = count[i];
//        element_having_max_freq = arr[i];
//      }
    }
    Arrays.sort(count);
      //System.out.println(Arrays.toString(count));
      if(count[n-1]>1)
      {
                 if(count[n-3]==count[n-2] && count[n-1]!=count[0]){
                     System.out.println("NO"); 
                   }
                else{
                     System.out.println("YES");
                     }
      }
      else System.out.println("NO");
   
  }
 
  // Driver program
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int t=input.nextInt();
      while(t-->0){
          int n=input.nextInt();
          int[] arr=new int[n];
          for (int i = 0; i < n; i++) {
              arr[i]=input.nextInt();
                
          }
           mostFrequent(arr, n);
      }
   

  }

    
}
