package org.example.maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        /*
        * Input:N = 2
Output:True
Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> divisors = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);
        for( int i=1;i<sqrt;i++) {
            if(n%i==0) {
                divisors.add(i);
                if(i!=n/i)
                    divisors.add(n/i);
            }
        }
        if(divisors.size()==2)
            System.out.println("Yes the given number is a prime number");
        else
            System.out.println("The given number is not a prime number");
    }
}
