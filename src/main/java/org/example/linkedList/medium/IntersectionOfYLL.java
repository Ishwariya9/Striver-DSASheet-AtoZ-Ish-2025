package org.example.linkedList.medium;

import org.example.linkedList.easy.Node;

public class IntersectionOfYLL {
    public static void main(String[] args) {
        Node head = null;
        head=insertNode(head,1);
        head=insertNode(head,3);
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,4);
        Node head1 = head;
        head = head.next.next.next;
        Node headSec = null;
        headSec=insertNode(headSec,3);
        Node head2 = headSec;
        headSec.next = head;
        Node d1=head1, d2=head2;
        while(d1!=d2) {
            d1 = d1==null? head2: d1.next;
            d2 = d2==null? head1: d2.next;
        }
        System.out.println("Intersecting value: "+ d1.val);

    }
    static Node insertNode(Node head,int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;
        while(temp.next != null) temp = temp.next;

        temp.next = newNode;
        return head;
    }
}
