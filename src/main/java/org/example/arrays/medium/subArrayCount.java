package org.example.arrays.medium;

import java.util.Scanner;

public class subArrayCount {
    public static void main(String[] args) {

        /*
        *
        * Input Format:
 N = 4, array[] = {3, 1, 2, 4}, k = 6
Result:
 2
Explanation:
 The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].

        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println("Target: ");
        int k = scanner.nextInt();
        int j=0,i=0,sum=arr[0],count=0;
        while(j<n) {
            while(i<=j && sum>k) {
                sum=sum-arr[i];
                i++;
            }
            if(sum==k)
                count++;
            j++;
            if(j<n)
                sum=sum+arr[j];
        }
        System.out.println("Count of subArrays: " + count);
    }
}
