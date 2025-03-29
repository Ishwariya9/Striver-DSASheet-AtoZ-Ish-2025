package org.example.patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        /*
        *
        * Input Format: N = 6
Result:
1          1
12        21
12       321
1234    4321
12345  54321
123456654321
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            for(int s=0;s<((n-i)*2);s++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
