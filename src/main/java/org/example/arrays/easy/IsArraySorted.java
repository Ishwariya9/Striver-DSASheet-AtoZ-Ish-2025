package org.example.arrays.easy;

import java.util.Scanner;

public class IsArraySorted {
    /*
    *
    * Example 1:
Input:
 N = 5, array[] = {1,2,3,4,5}
Output
: True.

*
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        boolean isSorted = true;
        for(int i=1; i<n;i++) {
            if(arr[i]<arr[i-1])
                isSorted = false;
        }
        System.out.println("Is array sorted? " + isSorted);
    }
}
