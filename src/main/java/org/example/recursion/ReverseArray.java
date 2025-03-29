package org.example.recursion;
import java.util.*;

public class ReverseArray {
    /*
    * Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        reverse(0,n-1,arr);
        for(int i=0;i<n;i++)
        System.out.println(arr[i]+" ");
    }
    private static void reverse(int i, int j,int[] arr) {
        if(i>arr.length/2)
            return;
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverse(i+1,j-1,arr);
    }
}
