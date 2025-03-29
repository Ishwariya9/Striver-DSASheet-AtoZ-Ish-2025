package org.example.arrays.medium;

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        /*
        * Input format:
 Arr[] = {1,3,2}
Output
: Arr[] = {2,1,3}
Explanation:
All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.

        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int ind=-1;
        for(int i=n-2;i>=0;i--) {
            if(arr[i]<arr[i+1]) {
                ind=i;
                break;
            }
        }
        if(ind==-1) {
            for(int i=n-1;i>=0;i--)
                System.out.print(arr[i]+" ");
            return;
        }
        for(int i=n-1;i>ind;i--) {
            if(arr[i]>arr[ind]) {
                int temp= arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
                break;
            }
        }
        for(int i=ind+1,j=n-1; i<=j; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i:arr)
            System.out.print(i+" ");
    }
}
