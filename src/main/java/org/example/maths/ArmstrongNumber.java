package org.example.maths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
        * Example 1:
          Input:N = 153
          Output:True
          Explanation: 13+53+33 = 1 + 125 + 27 = 153
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int copy_of_n = n;
        int armStrNum=0, digit=0;
        while(n>0) {
            digit = n%10;
            armStrNum = armStrNum + (digit*digit*digit);
            n=n/10;
        }
        boolean isArmstrongNumber = false;
        if(copy_of_n==armStrNum)
            isArmstrongNumber=true;
        System.out.println("Is the number "+copy_of_n+" is armstrongNumber? "+ isArmstrongNumber);

    }
}
