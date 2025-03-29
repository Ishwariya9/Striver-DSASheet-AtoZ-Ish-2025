package org.example.arrays.easy;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        /*
        * Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3,_,_,_,_]

        *
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int j=0;
        for(int i=1;i<n;i++) {
            if(arr[j]!=arr[i]) {
                j++;
                arr[j]=arr[i];
            }
        }
        for(int i=0;i<j+1;i++)
            System.out.println(arr[i]);
    }
}
