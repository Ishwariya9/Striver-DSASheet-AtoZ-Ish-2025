package org.example.linkedList.medium;

import org.example.linkedList.easy.Node;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Node node = new Node(arr[0]);
        Node head = node, temp = node;
        for (int i = 1; i < n; i++) {
            node.next = new Node(arr[i]);
            node = node.next;
        }
        boolean isPalindrom = true;
        Node fast=temp, slow = temp;
        while(fast!=null && fast.next!=null) {
            slow =slow.next;
            fast=fast.next.next;
        }
        Node newHead = reverse(slow.next);
        Node first=head,second = newHead;
        while(second!=null) {
            if (first.val != second.val) {
                isPalindrom = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        System.out.println("Is palindrome? "+ isPalindrom);
    }
    private static Node reverse(Node temp) {
        Node curr=temp, prev=null, next=null;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
