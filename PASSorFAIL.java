/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeChef;

import java.util.Scanner;

/**
 *
 * @author tanji
 */
public class PASSorFAIL {
      
    public static void main(String[] args) throws java.lang.Exception {
    Scanner input=new Scanner(System.in);
    int t=input.nextInt();
    while(t-->0){
        int tq=input.nextInt();
        int ans=input.nextInt();
        int pass=input.nextInt();
        int tt=((ans*3)+((tq-ans))*-1);
        if(tt>=pass){
            System.out.println("PASS");
        } 
        else{
            System.out.println("FAIL");            
        }
    }
    }
    
}
