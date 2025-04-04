package org.example.linkedList.easy;

public class DLL {
    int val;
    DLL prev;
    DLL next;
    public DLL(int val) {
        this.val = val;
        prev = null;
        next=null;
    }
    public DLL(int val, DLL prev) {
        this.val=val;
        this.prev=prev;
        this.next=null;
    }


}
