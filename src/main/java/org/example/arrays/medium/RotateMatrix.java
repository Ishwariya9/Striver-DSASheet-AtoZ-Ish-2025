package org.example.arrays.medium;

import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        /*
        * Input:
 [[1,2,3],[4,5,6],[7,8,9]]

Output
: [[7,4,1],[8,5,2],[9,6,3]]

Explanation:
 Rotate the matrix simply by 90 degree clockwise and return the matrix.

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
        for(int i=0;i<m;i++) {
            for(int j=i;j<n;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Matrix: ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n/2;j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-1-j]=temp;
            }
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
