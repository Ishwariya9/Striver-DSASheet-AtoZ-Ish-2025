package org.example.linkedList.easy;

import java.util.Arrays;
import java.util.List;

public class LengthOfLL {
    public static void main(String[] args) {
        /*
        * Example 1:
Input Format: 0->1->2
Result: 3
        * */
        List<Integer> arr = Arrays.asList(1,2,3,5,6);
        Node node = new Node(arr.get(0));
        Node head = node;
        for(int i=1;i<arr.size();i++) {
            node.next = new Node(arr.get(i));
            node=node.next;
        }
        printLL(head);
        Node temp=head;
        int count = 0;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Length: "+ count);
    }
    private static void printLL(Node head) {
        Node cpy=head;
        while(cpy!=null) {
            System.out.print(cpy.val + "->");
            cpy=cpy.next;
        }
    }
}
