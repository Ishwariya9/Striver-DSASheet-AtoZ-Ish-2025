package org.example.linkedList.medium;

import org.example.linkedList.easy.Node;

import java.util.Scanner;

import static org.example.linkedList.easy.Node.printLL;

public class Sort012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Node node = new Node(arr[0]);
        Node head = node, temp=head;
        for (int i = 1; i < n; i++) {
            node.next = new Node(arr[i]);
            node = node.next;
        }
        Node dummy0 = new Node(-1), dummy1 = new Node(-1), dummy2 = new Node(-2);
        Node dummy0Head=dummy0, dummy1Head=dummy1, dummy2Head=dummy2;
        while(temp!=null) {
            if(temp.val==0) {
                dummy0.next=temp;
                dummy0 = dummy0.next;
            }
            else if(temp.val==1){
                dummy1.next=temp;
                dummy1 = dummy1.next;
            }
            else {
                dummy2.next=temp;
                dummy2 = dummy2.next;
            }
            temp=temp.next;
        }
        dummy0.next = dummy1Head.next;
        dummy1.next = dummy2Head.next;
        printLL(dummy0Head.next);
    }
}
