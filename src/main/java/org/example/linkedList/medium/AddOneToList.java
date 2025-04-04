package org.example.linkedList.medium;

import org.example.linkedList.easy.Node;

import java.util.Scanner;

import static org.example.linkedList.easy.Node.printLL;

public class AddOneToList {
    // 999 ans:1000
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Node node = new Node(arr[0]);
        Node head = node, temp=node;
        for (int i = 1; i < n; i++) {
            node.next = new Node(arr[i]);
            node = node.next;
        }
        Node newHead = reverse(temp);
        printLL(newHead);
        System.out.println();
        Node temp1 = newHead;
        int carry=1;
        Node dummyHead = new Node(-1);
        Node dummy = dummyHead;
        while(temp1!=null) {
            int sum = temp1.val+carry;
            temp1=temp1.next;
            if(sum>9)
                carry=1;
            else
                carry=0;
            dummyHead.next = new Node(sum%10);
            dummyHead=dummyHead.next;
        }
        if(carry==1)
            dummyHead.next = new Node(1);

        printLL(reverse(dummy.next));

    }
    private static Node reverse(Node temp) {
        Node curr = temp, prev = null, front=null;
        while(curr!=null) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }
}
