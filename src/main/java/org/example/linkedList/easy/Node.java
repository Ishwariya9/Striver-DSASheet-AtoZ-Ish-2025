package org.example.linkedList.easy;


public class Node {
    public int val;
    public Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
    public static void printLL(Node head) {
        Node cpy=head;
        while(cpy!=null) {
            System.out.print(cpy.val + "->");
            cpy=cpy.next;
        }
    }
}
