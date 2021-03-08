package com.single_linked_list;
import com.single_linked_list.SinglyLinkedList;
public class Main {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(8);
        linkedList.insertFirst(5);
        linkedList.insertFirst(3);
       // linkedList.deleteFirst();
        //its gonna be 5 -> 8 -> 1 -> NULL
        linkedList.printLinkedList();
    }
}
