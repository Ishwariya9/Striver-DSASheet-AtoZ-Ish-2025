package org.example.linkedList.medium;

import org.example.linkedList.easy.Node;

import java.util.Scanner;

import static org.example.linkedList.easy.Node.printLL;

public class AddList {
    /*
    * num1  = 243, num2 = 564

l1 = [2,4,3]
l2 = [5,6,4]

Result: sum = 807; L = [7,0,8]
    * */
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
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1 ;i++) {
            arr1[i]= scanner.nextInt();
        }
        Node node1 = new Node(arr1[0]);
        Node head1 = node1;
        for(int i=1;i<n1;i++) {
            node1.next = new Node(arr1[i]);
            node1=node1.next;
        }

        Node temp = head, temp1= head1, dummy = new Node(-1), dummyHead=dummy;
        int carry=0;
        while(temp!=null || temp1!=null) {
            int sum = carry;
            if(temp!=null) {
                sum = sum + temp.val;
                temp=temp.next;
            }
            if(temp1!=null) {
                sum = sum + temp1.val;
                temp1=temp1.next;
            }
            if(sum>9)
                carry=1;
            else
                carry=0;
            Node newNode = new Node(sum%10);
            dummy.next = newNode;
            dummy=dummy.next;
        }
        if(carry==1)
            dummy.next=new Node(1);
        printLL(dummyHead.next);

    }

}
