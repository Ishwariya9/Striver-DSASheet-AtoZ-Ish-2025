package org.example.linkedList.easy;

import java.util.Scanner;

public class DeleteLast {
    public static void main(String[] args) {
        /*
        * Input Format: 12->5->8->7

Result: 12->5->8

*
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
            node = node.next;
        }
        printLL(head);
        Node temp=head;
        while (temp.next!=null && temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        System.out.println("Deleted last node:");
        printLL(head);
    }

    private static void printLL(Node head) {
        Node cpy=head;
        while(cpy!=null) {
            System.out.print(cpy.val + "->");
            cpy=cpy.next;
        }
    }
}
