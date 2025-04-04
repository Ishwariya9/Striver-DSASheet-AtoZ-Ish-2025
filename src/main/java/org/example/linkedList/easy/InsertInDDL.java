package org.example.linkedList.easy;

import java.util.Scanner;

public class InsertInDDL {
    public static void main(String[] args) {
        /*
        * Input Format:

DLL: 1 <-> 2 <-> 3 <-> 4

Value to be Inserted: 6
        * */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        DLL node = new DLL(arr[0]);
        DLL head = node, prev=null, next=null;
        for(int i=1;i<n;i++) {
            node.next = new DLL(arr[i],node);
            node=node.next;
        }
        printLL(head);
        System.out.println("Insert at last");
        int num = scanner.nextInt();
        DLL temp = head;
        while(temp.next != null) {
            temp=temp.next;
        }
        DLL newNode = new DLL(num);
        newNode.prev=temp;
        temp.next = newNode;
        printLL(head);
    }
    private static void printLL(DLL head) {
        DLL cpy=head;
        while(cpy.next!=null) {
            System.out.print(cpy.val + "->");
            cpy=cpy.next;
        }
        System.out.println();
        while(cpy!=null) {
            System.out.print(cpy.val+"->");
            cpy=cpy.prev;
        }
    }
}
