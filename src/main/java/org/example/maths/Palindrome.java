package org.example.maths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
        *
        * Input:N = 4554
Output:Palindrome Number
Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number
*
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int copy_of_n = n;
        int rev=0, digit =0;
        while(n>0) {
            digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }
        boolean isPalindrome = false;
        if(rev==copy_of_n)
            isPalindrome = true;
        System.out.println("Is the number"+ copy_of_n +" palindrome? "+ isPalindrome);

    }
}
