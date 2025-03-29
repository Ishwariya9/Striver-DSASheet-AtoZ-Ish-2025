package org.example.arrays.easy;

import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        /*
        * Input:
 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output:
 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int j=-1;
        for(int i=0;i<n;i++) {
            if(arr[i]!=0) {
                j++;
                arr[j]=arr[i];
            }
        }
        for(int i=0;i<j+1;i++) {
            System.out.print(arr[i]+ " ");
        }
        for(int i=j;i<n;i++){
            System.out.println(0+" ");
        }
    }
}
