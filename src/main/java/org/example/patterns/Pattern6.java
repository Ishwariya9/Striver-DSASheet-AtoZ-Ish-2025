package org.example.patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        /*
        *
        * Input Format: N = 6
          Result:
          1 2 3 4 5 6
          1 2 3 4 5
          1 2 3 4
          1 2 3
          1 2
          1
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=n;i>0;i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" " );
            }
            System.out.println();
        }
    }
}
