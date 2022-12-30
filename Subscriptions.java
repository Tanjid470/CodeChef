package CodeChef;

import java.util.Scanner;
import java.util.*;

public class Subscriptions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            String s = input.next();

            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    int count = 0;
                    while (s.charAt(i) == '1')
                    {
                        count++;
                        i++;
                        if (i == n) {
                            if (count % 2 != 0) {
                                System.out.println("NO");
                                flag = 1;
                                break;
                            }
                        }
                    }
                if (count % 2 != 0 && flag == 0) {
                    System.out.println("NO");
                    flag = 1;
                    break;
                }    
                }
                
            }
            if (flag == 0) {
                System.out.println("YES");
            }
        }

    }

}
