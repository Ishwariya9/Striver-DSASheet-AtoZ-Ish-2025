package org.example.maths;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        /*
        * Input:N = 12345
Output:5
Explanation:  The number 12345 has 5 digits.
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int copy_of_n = n;
        int digit=0;
        while(n>0) {
            digit=digit+1;
            n=n/10;
        }
        System.out.println("Digit count for the number : "+ copy_of_n +" is --->"+ digit);
    }
}
