package org.example.patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        /*
        *
        * Input Format: N = 6
Result:
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                System.out.print("*");
            }
            for(int k=0;k<(2*i);k++) {
                System.out.print(" ");
            }
            for(int j=i;j<n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>0;i--) {
            for(int j=i;j<=n;j++) {
                System.out.print("*");
            }
            for(int k=0;k<(2*(i-1));k++) {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
