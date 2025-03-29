package org.example.patterns;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        /*
        *
        * Input Format: N = 3
Result:
*    *
**  **
******
**  **
*    *
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++) {
            printStars(i,n);
        }

        for(int i=n-1;i>0;i--) {
            printStars(i,n);
        }

    }
    private static void printStars(int i, int n) {
        for(int j=1;j<=i;j++) {
            System.out.print("*");
        }
        for(int k=0;k<(2*n)-(2*i);k++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
