package org.example.arrays.medium;

import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        /*
        * Input:

 arr = [4, 7, 1, 0]
Output
:
 7 1 0
Explanation:
 Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.print(arr[n-1]+" ");
        int max= arr[n-1];
        for(int i=n-2;i>=0;i--) {
            if(arr[i]>max) {
                System.out.print(arr[i] + " ");
                max=arr[i];
            }
        }

    }
}
