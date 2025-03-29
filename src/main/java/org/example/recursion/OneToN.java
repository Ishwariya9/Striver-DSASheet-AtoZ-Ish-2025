package org.example.recursion;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
//        1 2 3 4 5
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(1,n);
    }
    private static void print(int i, int n) {

        if(i>n)
            return;
        System.out.print(i+" ");
        print(i+1,n);
    }

}


