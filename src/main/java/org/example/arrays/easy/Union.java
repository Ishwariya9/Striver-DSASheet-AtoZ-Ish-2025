package org.example.arrays.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        /*
        * Example 1:
Input:

n = 5,m = 5.
arr1[] = {1,2,3,4,5}
arr2[] = {2,3,4,4,5}
Output:

 {1,2,3,4,5}

Explanation:

Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5}

        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array1:");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1 ;i++) {
            arr1[i]= scanner.nextInt();
        }
        System.out.println("Array2:");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2 ;i++) {
            arr2[i]= scanner.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2) {
            if(arr1[i]<=arr2[j]) {
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
            }
            else {
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1) {
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]) {
                ans.add(arr1[i]);
            }
            i++;
        }
        while(j<n2) {
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }
        System.out.println(ans);

    }
}
