package org.example.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestAndLowestFrequency {
    public static void main(String[] args) {
        /*
        *
        * Example 1:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

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

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = 0, minEle = 0, maxEle = 0;
        for(Map.Entry<Integer,Integer> entry: hash.entrySet()) {


            if(entry.getValue() < minFreq) {
                minEle = entry.getKey();
                minFreq = entry.getValue();
            }
            if(entry.getValue() > maxFreq) {
                maxEle = entry.getKey();
                maxFreq = entry.getValue();
            }

        }
        System.out.println(minEle +"    "+maxEle);

    }
}
