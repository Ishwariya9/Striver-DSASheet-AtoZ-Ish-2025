package org.example.patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        /*
        *
        * Input Format: N = 6
          Result:
          1
          01
          101
          0101
          10101
          010101
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++) {
            int no = 1;
            if(i%2==0)
                no=0;
            for(int j=1;j<=i;j++) {
                System.out.print(no+ " ");
                no=1-no;
            }
            System.out.println();
        }
    }
}
