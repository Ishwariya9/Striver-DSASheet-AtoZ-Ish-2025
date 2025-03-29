package org.example.patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        /*
        *
        * Input Format: N = 6
          Result:
     *
     **
     ***
     ****
     *****
     ******
     *****
     ****
     ***
     **
     *
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
