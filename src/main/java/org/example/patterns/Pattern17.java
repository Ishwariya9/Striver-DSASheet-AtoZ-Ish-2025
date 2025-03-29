package org.example.patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        /*
        *
        * Input Format: N = 6
Result:
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
ABCDEFEDCB
        *
        * */

       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++) {
            for(int s=0;s<(n-i);s++)
                System.out.print(" ");

            int j=0;
            char start = 'A';
            while(j <= ((2*i-1)/2)){
                System.out.print((char)(start+j));
                j++;
            }
            char start1 = (char)('A'+j-1);
            while(j<(2*i-1)) {
                System.out.print((char)(start1-1));
                start1= (char) (start1-1);
                j++;
            }

            for(int s=0;s<(n-i);s++)
                System.out.print(" ");
            System.out.println();
        }

    }
}
