package org.example.arrays.medium;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        /*
        * Input:
 nums = [2,0,2,1,1,0]
Output
: [0,0,1,1,2,2]
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int low=0,mid=0,high=n-1;
        while(mid<high) {
            if(arr[mid]==0) {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1)
                mid++;
            else{
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        for(int i:arr)
           System.out.print(i+" ");
    }
}
