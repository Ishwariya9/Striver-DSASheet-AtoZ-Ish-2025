package org.example.patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        /*
        *  Input Format: N = 6
           Result:
           *
           * *
           * * *
           * * * *
           * * * * *
           * * * * * *
        *
        *
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
