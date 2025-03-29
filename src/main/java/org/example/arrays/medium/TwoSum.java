package org.example.arrays.medium;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        /*
        * Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
        * */
        int[] ans = new int[]{-1,-1};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Target: ");
        int k = scanner.nextInt();
        int left=0, right=n-1, sum=0;
        while(left<right) {
            sum = arr[left]+arr[right];
            if(sum<k) {
                left++;
            }
            else if(sum>k) {
                right--;
            }
            else {
                ans[0]=left;
                ans[1]=right;
                break;
            }
        }
        System.out.println(ans[0]+" "+ ans[1]);
    }
}
