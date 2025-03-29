package org.example.patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        /*
        *
        * Input Format: N = 6
Result:
A B C D E F
A B C D E
A B C D
A B C
A B
A
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=n;i>0;i--) {
            for(char ch = 'A'; ch < 'A'+ i; ch++) {
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
}
