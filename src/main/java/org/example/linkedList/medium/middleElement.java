package org.example.linkedList.medium;

import org.example.linkedList.easy.Node;

import java.util.Scanner;

import static org.example.linkedList.easy.Node.printLL;

public class middleElement {
    public static void main(String[] args) {
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
        Node fast = head, slow = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element: " + slow.val);
    }
}
