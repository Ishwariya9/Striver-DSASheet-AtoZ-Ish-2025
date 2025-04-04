package org.example.linkedList.easy;

import java.util.Scanner;

public class DeleteLastDLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i]= scanner.nextInt();
        }
        DLL node = new DLL(arr[0]);
        DLL head = node;
        for(int i=1;i<n;i++) {
            node.next = new DLL(arr[i],node);
            node=node.next;
        }
        printLL(head);
        System.out.println("delete last");
        DLL temp = head;
        while(temp.next != null) {
            temp=temp.next;
        }
        temp.prev.next=null;
        temp.prev=null;
        printLL(head);
    }
    private static void printLL(DLL head) {
        DLL cpy=head;
        while(cpy.next!=null) {
            System.out.print(cpy.val + "->");
            cpy=cpy.next;
        }
        System.out.print(cpy.val+" \n");
        while(cpy!=null) {
            System.out.print(cpy.val+"->");
            cpy=cpy.prev;
        }
    }
}
