package org.example.arrays.easy;

import java.util.Scanner;

public class LongestSubarrWithKSum {
    public static void main(String[] args) {
        /*
        * Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.
* approach: two pointer. Intuition: In an array, if we move the sum increases. if sum increases, shrink the array.
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println("K: ");
        int k = scanner.nextInt();
        int sum = arr[0];
        int i=0, j=0, length=0;
        while(j<n) {
            while(i<=j && sum>k) {
                sum -= arr[i];
                i++;
            }
            if(sum==k) {
                length = Math.max(length, j - i + 1);
            }
            j++;
            if(j<n) {
                sum+= arr[j];
            }
        }
        System.out.println("Max subArray length: "+ length);
    }
}
