package org.example.maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        /*
        * Input:N = 12345
          Output:54321
          Explanation: The reverse of 12345 is 54321.
        *
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int copy_of_n = n;
        int rev=0, digit =0;
        while(n>0) {
            digit = n%10;
            rev = (rev*10)+digit;
            n=n/10;
        }
        System.out.println("Reverse of: "+ copy_of_n+" is -->" + rev);
    }
}
