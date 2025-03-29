package org.example.patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        /*
        *
        * Input Format: N = 6
Result:
******
*    *
*    *
*    *
*    *
******
        *
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1) {
                for(int j=0;j<2*n;j++)
                    System.out.print("*");
            }
            else {
                System.out.print("*");
                for(int j=0;j<(2*n)-2;j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
