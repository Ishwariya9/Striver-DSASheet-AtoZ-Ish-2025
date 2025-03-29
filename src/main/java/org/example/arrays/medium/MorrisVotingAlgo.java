package org.example.arrays.medium;

import java.util.Scanner;

public class MorrisVotingAlgo {
    public static void main(String[] args) {
        /*
        * Input Format
: N = 3, nums[] = {3,2,3}
Result
: 3
Explanation
: When we just count the occurrences of each number and compare with half of the size of the array, you will get 3 for the above solution.
        *
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int count=0, element=0;
        for(int i:arr) {
            if(count==0) {
                count++;
                element=i;
            }
            else if(element==i) {
                count++;
            }
            else if(element!=i) {
                count--;
            }
        }
        int cnt=0;
        for(int i:arr) {
            if(i==element)
                cnt++;
        }
        if(cnt>=n/2)
            System.out.println(element);
        else
            System.out.println(-1);
    }
}
