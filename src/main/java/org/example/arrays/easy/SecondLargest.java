package org.example.arrays.easy;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        /*
        *
        * Example 1:
Input:
 [1,2,4,7,7,5]
Output:
 Second Smallest : 2
	Second Largest : 5
Explanation:
 The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int secondSmallest=Integer.MAX_VALUE;
        int secondLarget = Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i:arr){
            if(i<smallest) {
                secondSmallest = smallest;
                smallest = i;
            }
            else if(i<secondSmallest && i!=smallest)
                secondSmallest = i;
            if(i>largest) {
                secondLarget = largest;
                largest = i;
            }
            else if(i>secondLarget && i!= largest)
                secondLarget=i;
        }
        System.out.println("Second Largest: "+ secondLarget);
        System.out.println("Second Smallest: "+ secondSmallest);
    }
}
