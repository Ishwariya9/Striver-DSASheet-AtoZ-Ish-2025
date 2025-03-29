package org.example.arrays.easy;

import java.util.Scanner;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        /*
        * Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}

Output: 3
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int count = 0, max=0;
        for(int i:arr) {
            if(i==0) {
                count = 0;
            }
            else
               count++;
            max=Math.max(max,count);
        }
        System.out.println(max);

    }
}
