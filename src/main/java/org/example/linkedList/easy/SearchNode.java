package org.example.linkedList.easy;

import java.util.Scanner;

public class SearchNode {
    public static void main(String[] args) {
        /*
        * Example 1:
Input Format: 0->1->2, val = 2
Result True
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        Node node = new Node(arr[0]);
        Node head = node;
        for(int i=1;i<n;i++) {
            node.next = new Node(arr[i]);
            node=node.next;
        }
        printLL(head);
        System.out.println("Target: ");
        int num = scanner.nextInt();
        Node temp = head;
        boolean res = false;
        while(temp!=null) {
            if(temp.val == num) {
                res=true;
                break;
            }
            temp = temp.next;
        }
        System.out.println("Is number found?"+res);
    }
    private static void printLL(Node head) {
        Node cpy=head;
        while(cpy!=null) {
            System.out.print(cpy.val + "->");
            cpy=cpy.next;
        }
    }
}
