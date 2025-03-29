package org.example.recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
        * Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
        * */
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(isPalindrome(0,input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
    private static boolean isPalindrome(int i,String input) {
        if(i>input.length()/2)
            return true;
        if(input.charAt(i) != input.charAt(input.length()-1-i))
            return false;
        return isPalindrome(i+1,input);
    }
}
