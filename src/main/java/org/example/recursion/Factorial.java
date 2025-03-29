package org.example.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /*
        * Example 1:
Input: X = 5
Output: 120
Explanation: 5! = 5*4*3*2*1
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Factorial: "+ factorial(n));
    }
    private static int factorial(int n) {
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
}
