package org.example.arrays.medium;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        /*
        * Example 1:
Input:
 arr = [-2,1,-3,4,-1,2,1,-5,4]

Output:
 6

Explanation:
 [4,-1,2,1] has the largest sum = 6.
 * sol - kadane's algo
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int sum=0, max=Integer.MIN_VALUE, start=0,s=-1,e=-1;
        for(int i=0;i<arr.length;i++) {
            if(sum==0)
                start=i;
            sum=sum+arr[i];
             if(sum>max) {
                max=sum;
                s=start;
                e=i;
            }
             if(sum<0) {
                sum = 0;
            }
        }
        System.out.println("Max:" + max);
        for(int i=s;i<=e;i++)
            System.out.print(arr[i]+" ");

    }
}
