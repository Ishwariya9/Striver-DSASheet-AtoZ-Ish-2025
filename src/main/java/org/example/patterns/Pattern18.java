package org.example.patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        /*
        *
        * Input Format: N = 6
Result:
F
E F
D E F
C D E F
B C D E F
A B C D E F
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=i;j>0;j--) {
                System.out.print((char)('A'+n-j));
            }
            System.out.println();
        }
    }
}
