
package CodeChef;

import java.util.Scanner;


public class BinaryToDecimal {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();   
		    sc.nextLine();
		    String s = sc.nextLine();
            
            long mod = 998244353;
		    long[] arr = new long[n];
		    long res = 1;
		    long sol = 0;
		    
		    if(s.charAt(0)=='1')
		    {
		        arr[0] = 1;
		    }
		    
		    long temp = arr[0];
		    for(int j=1 ; j<n ; j++)
		    {
		        if(s.charAt(j) == '1')
		        {
		             temp +=(j+1);
		        }
		        arr[j] = temp;
		        arr[j] = arr[j]%2;
		        
		    }
		    for(int j=n-1;j>=0;j--)
		    {
		        if(arr[j]==1)
		        {
		            sol += res;
		            sol = sol%mod;
		        }
		        res = res*2;
		        res = res%mod;
		    }
		    System.out.println(sol%mod);
		}   
	}
    
}
