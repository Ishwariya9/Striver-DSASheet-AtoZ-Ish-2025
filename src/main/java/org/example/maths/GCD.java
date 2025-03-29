package org.example.maths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        /*
        * Example 1:
Input:N1 = 9, N2 = 12

Output:3
Explanation:Factors of 9: 1, 3 and 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.
Example 2:
Input:N1 = 20, N2 = 15
        * */

        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int gcd = 1;
        for(int i=1; i< Math.min(n1,n2); i++) {
            if(n1%i == 0  && n2%i == 0)
                gcd = i;
        }
        System.out.println("GCD of"+ n1 +" and "+ n2 +" is.."+ gcd);

    }
}
