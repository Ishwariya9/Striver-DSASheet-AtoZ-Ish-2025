package org.example.recursion;

import java.util.Scanner;

public class NToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n,n);
    }
    private static void print(int i, int n) {
        if(i==0)
            return;

        System.out.print(i+" ");
        print(i-1,n);
    }
}
