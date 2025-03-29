package org.example.arrays.easy;

import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        /*
        * Example 1:
Input:
 N = 5, array[] = {1,2,3,4,5}
Output:
 2,3,4,5,1
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int temp= arr[0];
        for(int i=1;i<n;i++) {
            arr[i-1]=arr[i];
        }
        arr[n-1] = temp;
        System.out.println("Left rotated array:");
        for(int i:arr)
            System.out.print(i+" ");
    }
}
