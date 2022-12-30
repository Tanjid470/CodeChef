
package CodeChef;

import java.util.Scanner;


public class kingKill 
{
  
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("How many people :");
        int n=input.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i <n; i++)
        {
            ar[i]=0;
        }
      
        int count = 0,k=1;
        int flag=0;
        System.out.print("Starting Point :");
        int position=input.nextInt();
        int position1=position;
        
        for (int j = position; j < n; j++) 
        { 
 if( flag==0)
 {
     if(k<ar.length-1)
     {
          if(j<n-1)
          {  
              ar[position1]=1;
                     if(ar[j]==0)
                      {
                      count++;                        
                           if(count==2)
                              {
                                 ar[j]=1;
                                 count=0;
                                 k++;
                              }
                       }        
                    }         
          else
           {
               if(ar[j]==0){
                 count++;
                  if(count==2){
                    ar[j]=1;
                    count=0;
                    k++;
                  }
               }
            j=-1;    
           }
      }
      else 
      {
            flag=1;
      }
 }
 else
 {
     break;
 }
        
        }
       
        System.out.println("Killed  : "+k);
        for (int i = 0; i < n; i++) {
            if(ar[i]==0)
                System.out.println("\n\n\n\tThe "+(i)+" Position person will be alive.\n\n\n\n\n");
        }
    }
   
}
