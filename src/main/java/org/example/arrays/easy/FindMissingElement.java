package org.example.arrays.easy;

import java.util.Scanner;

public class FindMissingElement {
    public static void main(String[] args) {
        /*
        * Example 1:
Input Format:
 N = 5, array[] = {1,2,4,5}
Result:
 3

        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n-1 ;i++) {
            arr[i]= scanner.nextInt();
        }
        int sum = (n*(n+1))/2;
        int arrSum = 0;
        for(int i:arr)
            arrSum += i;
        System.out.println("Missing number: " + (sum-arrSum));
    }
}
