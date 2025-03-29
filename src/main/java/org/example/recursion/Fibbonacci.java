package org.example.recursion;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        /*
        *
        * Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)
        *
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<=n;i++) {
            System.out.println(fib(i));
        }
    }
    private static int fib(int n) {
        if(n<=1)
            return n;
        int first = fib(n-1);
        int last = fib(n-2);
        return first+last;
    }
}
