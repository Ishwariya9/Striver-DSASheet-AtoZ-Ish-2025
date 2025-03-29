package org.example.arrays.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        /*
        * Example 1:
Input:
 [100, 200, 1, 3, 2, 4]

Output:
 4

Explanation:
 The longest consecutive subsequence is 1, 2, 3, and 4.

        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        int count=0, last=Integer.MIN_VALUE, large=1;
        for(int i=0;i<n;i++) {
            if(arr[i]-1==last) {
                last=arr[i];
                count++;
            }
            else if(arr[i]!=last) {
                count=1;
                last=arr[i];
            }
            large=Math.max(large,count);
        }
        System.out.println("Largest sequence: "+large);

    }
}
