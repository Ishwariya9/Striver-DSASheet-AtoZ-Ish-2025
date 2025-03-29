package org.example.arrays.easy;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        /*
        * Example 1:
Input: arr[]= 1 2 3 4 5, num = 3
Output: 2
Explanation: 3 is present in the 2nd index

        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int k = scanner.nextInt();
        int ind=-1;
        for(int i=0;i<n;i++) {
            if(arr[i]==k)  {
                ind=i;
                break;
            }
        }
        System.out.println("Found at index:" + ind);
    }
}
