package org.example.hashing;

import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
        /*
        * Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]= scanner.nextInt();
        }
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++) {
            if(hash.containsKey(arr[i])) {
                int val = hash.get(arr[i]);
                hash.put(arr[i],val+1);
            }
            else {
                hash.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: hash.entrySet()) {
            System.out.println("kay:  "+ entry.getKey() + "  value:  "+ entry.getValue());
        }

    }
}
