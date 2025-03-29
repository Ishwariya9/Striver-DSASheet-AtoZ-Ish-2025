package org.example.arrays.medium;

import java.util.Scanner;

public class ZeroMatrix {
    public static void main(String[] args) {
        /*
        * Examples 1:
Input:
 matrix=[[1,1,1],[1,0,1],[1,1,1]]

Output:
 [[1,0,1],[0,0,0],[1,0,1]]

Explanation:
 Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

        *
        * */

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int col0=1;
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    if (j != 0)
                        arr[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }
            for(int i=1;i<m;i++) {
                for(int j=1;j<n;j++) {
                    if(arr[i][0]==0 || arr[0][j]==0)
                        arr[i][j]=0;
                }
            }
            if(col0==0) {
                for(int i=0;i<m;i++)
                    arr[i][0]=0;
            }
            if(arr[0][0]==0) {
                for(int j=0;j<n;j++)
                    arr[0][j]=0;
            }

        System.out.println("Matrix: ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
