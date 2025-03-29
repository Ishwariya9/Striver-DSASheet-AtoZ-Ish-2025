package org.example.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        /*
        *
        * Input Format: N = 6
Result:
A
B B
C C C
D D D D
E E E E E
F F F F F F
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print((char)('A'+i)+" ");
            }
            System.out.println();
        }
    }
}
