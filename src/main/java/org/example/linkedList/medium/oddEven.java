package org.example.linkedList.medium;

import org.example.linkedList.easy.Node;

import java.util.Scanner;

import static org.example.linkedList.easy.Node.printLL;

public class oddEven {
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
        Node oddHead= new Node(-1);
        Node evenHead= new Node(-1);
        Node dummy1 = oddHead;
        Node dummy2 = evenHead;
        Node temp=head;
        while(temp!=null) {
            if(temp.val % 2 ==0)  {
                evenHead.next = temp;
                evenHead = evenHead.next;
            }
            else {
                oddHead.next = temp;
                oddHead = oddHead.next;
            }
            temp=temp.next;
        }
        evenHead.next = dummy1.next;
        printLL(dummy2.next);
    }
}
