
package CodeChef;

import java.util.Scanner;


public class DuplicateReplace {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int col=input.nextInt();
        int row=input.nextInt();
        int[][] matrix=new int[col][row];
      
        int[] check=new int[5555];
        for (int i = 0; i <5555; i++) {
            check[i]=0;
        }
          for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j]=input.nextInt(); 
                if(check[matrix[i][j]]==0){
                    check[matrix[i][j]]=1;
                }
                else matrix[i][j]=-1;
            }
        }          
        //Output
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[i][j]+" ");
            }System.out.println("");
        }
    }
    
}
