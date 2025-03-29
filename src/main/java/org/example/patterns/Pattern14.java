package org.example.patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
    /*
        *
        * Input Format: N = 6
          Result:
          A
          A B
          A B C
          A B C D
          A B C D E
          A B C D E F
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++) {
            for(char ch='A';ch< 'A'+i; ch++) {
                System.out.print( ch + " ");
            }
            System.out.println();
        }
    }

}
