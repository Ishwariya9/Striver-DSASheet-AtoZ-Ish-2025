package org.example.arrays.easy;

import java.util.Scanner;

public class FindSingleElement {
    /*
    * Example 1:
Input Format:
 arr[] = {2,2,1}
Result:
 1
Explanation:
 In this array, only the element 1 appear once and so it is the answer.
 *
 * SOLUTION:
 * Step	Operation	Value of xorr	Explanation
1	0 ^ 4	4	0 XOR any number gives the number itself
2	4 ^ 1	5	4 (100) ^ 1 (001) = 5 (101)
3	5 ^ 2	7	5 (101) ^ 2 (010) = 7 (111)
4	7 ^ 1	6	7 (111) ^ 1 (001) = 6 (110)
5	6 ^ 2	4	6 (110) ^ 2 (010) = 4 (100)
Final value of xorr is 4, which is the unique element in the array.

Why Does This Work?
Pairs cancel out because a ^ a = 0.

1 ^ 1 = 0, 2 ^ 2 = 0

Only the unique number remains because x ^ 0 = x.

After canceling pairs, we're left with 4.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int xor = 0;
        for(int i: arr)
            xor = xor ^ i;
        System.out.println("Missing element: " + xor);
    }

}
