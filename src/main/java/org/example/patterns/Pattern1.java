package org.example.patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[]) {
    /* Example 1:
       Input: N = 3
       Output:
       * * *
       * * *
       * * *
    *
    *
    * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
