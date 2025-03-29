package org.example.arrays.easy;

import java.util.Scanner;

public class LargestElement {
    /*
    *
    * Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array.
    *
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i:arr) {
            if(i>max)
                max=i;
        }
        System.out.println("Maximum element: "+ max);
    }
}
