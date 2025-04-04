package org.example.linkedList.easy;

import java.util.Scanner;

public class InsertAtHead {
    public static void main(String[] args) {
        /*
        * Input Format: 0->1->2, val = 5

Result: 5->0->1->2
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        int num = scanner.nextInt();
        Node node = new Node(arr[0]);
        Node head = node;
        for(int i=1;i<n;i++) {
            node.next = new Node(arr[i]);
            node = node.next;
        }

        System.out.println("LinkedList: ");
        printLL(head);
        System.out.println("Inserting at head");
        Node newHead = new Node(num);
        newHead.next = head;
        head = newHead;
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
