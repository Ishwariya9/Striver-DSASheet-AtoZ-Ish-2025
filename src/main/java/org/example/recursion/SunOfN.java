package org.example.recursion;

import java.util.Scanner;

public class SunOfN {
    public static void main(String[] args) {
        /*
        *
        * Example 1:
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15
*
* */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(" Sum of numbers: "+ sum(n));
    }
    private static int sum(int n) {
        if(n==0)
            return 0;
        return n+sum(n-1);
    }
}
