package org.example.arrays.medium;

import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        /*
        * Input: Matrix[][] = { { 1, 2, 3, 4 },
		      { 5, 6, 7, 8 },
		      { 9, 10, 11, 12 },
	              { 13, 14, 15, 16 } }

Outhput: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
Explanation: The output of matrix in spiral form.
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
        List<Integer> ans = new ArrayList<>();
        int top=0, bottom=m-1, left=0, right=n-1;

        while(top<=bottom && left<=right) {
            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }
            if (left <= right){
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
        }

        }
    }
}
