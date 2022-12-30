
package CodeChef;
import java.util.Scanner;



public class ToDoList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int t=input.nextInt();
        int[] arr=new int[100];
     
                while(t-->0)
                {
                    int count=0;
                    int n=input.nextInt();
                    for (int i = 0; i < n; i++) 
                    {
                        arr[i]=input.nextInt();


                        if(arr[i]>1000){
                            count++;
                        }
                    }
                    System.out.println(count);                     
                }
        
    }
    
}
