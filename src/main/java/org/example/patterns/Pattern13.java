package org.example.patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
    /*
        *
        * Input Format: N = 3
          Result:
          1
          2 3
          4 5 6
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int no=1;
        for (int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print((no++) + " ");
            }
            System.out.println();
        }
    }

}
