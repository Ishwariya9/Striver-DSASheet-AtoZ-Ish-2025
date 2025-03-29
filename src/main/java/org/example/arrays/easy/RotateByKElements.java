package org.example.arrays.easy;

import java.util.Scanner;

public class RotateByKElements {
    public static void main(String[] args) {
        /*
        *
        * Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println("right/left rotation?");
        String typeOfRotation = scanner.next();
        System.out.println("k value: ");
        int k = scanner.nextInt();
        k = k%n;
        if(k==0) {
            printArray(arr);
            return;
        }
        else if (typeOfRotation.equalsIgnoreCase("right"))
            rightRotate(arr,k);
        else
            leftRotate(arr,k);
        printArray(arr);
    }
    private static void printArray(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    private static void leftRotate(int[] arr, int k){
        System.out.println("Left rotation: ");
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    private static void rightRotate(int[] arr, int k){
        System.out.println("Right rotation: ");
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    private static void reverse(int[] arr, int start, int end) {
        while(start<=end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
