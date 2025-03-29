package org.example.arrays.medium;

import java.util.Scanner;

public class PositiveNegativeArray {
    public static void main(String[] args) {
        /*
        * Input:
arr[] = {1,2,-4,-5}, N = 4
Output:
1 -4 2 -5

Explanation:

Positive elements = 1,2
Negative elements = -4,-5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.

        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int[] ans = new int[n];
        int m=0,n1=1;
        for(int i:arr) {
            if(i>0) {
                ans[m]=i;
                m=m+2;
            }
            if(i<0) {
                ans[n1]=i;
                n1=n1+2;
            }
        }
        for(int i:ans)
            System.out.print(i+" ");
    }
}
