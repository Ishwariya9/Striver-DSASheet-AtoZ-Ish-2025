package org.example.maths;

import java.util.*;

public class Factors {
    public static void main(String[] args) {
        /*
        *
        * Example 1:
Input:N = 36
Output:[1, 2, 3, 4, 6, 9, 12, 18, 36]
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> divisors = new ArrayList<>();
        int sqrt =  (int) Math.sqrt(n);
        for(int i=1;i<=sqrt;i++) {
            if(n%i==0) {
                divisors.add(i);
                if (i != (n / i))
                    divisors.add(n / i);
            }
        }
        Collections.sort(divisors);
        System.out.println("Divisors of "+ n+ " :"+ divisors);
    }
}
