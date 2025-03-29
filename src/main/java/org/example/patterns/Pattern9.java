package org.example.patterns;

import java.util.Scanner;

public class Pattern9 {
        public static void main(String[] args){
        /*
        *
        * Input Format: N = 6
          Result:
               *
              ***
             *****
            *******
           *********
          ***********
          ***********
           *********
            *******
             *****
              ***
               *
        *
        *
        * */

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            printPyramid(n);
            printInvertedPyramid(n);
        }

        private static void printPyramid(int n) {
            for (int i = 0; i <= n; i++) {
                for (int s1 = 0; s1 < (n - i); s1++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * i - 1); j++) {
                    System.out.print("*");
                }
                for (int s2 = 0; s2 < (n - i); s2++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

        private static void printInvertedPyramid(int n) {
            for (int i = n; i > 0; i--) {
                for (int s1 = 0; s1 < (n - i); s1++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * i - 1); j++) {
                    System.out.print("*");
                }
                for (int s2 = 0; s2 < (n - i); s2++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

}
