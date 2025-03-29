package org.example.patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {

        /*
        *
        *Input Format: N = 3
Result:
3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<2*n-1;i++) {
            for(int j=0;j<2*n-1;j++) {
                int top=i;
                int left =j;
                int right = (2*n-2)-j;
                int bottom = (2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
    }
}
