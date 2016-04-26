package com.kevinmichie;
import java.util.LinkedList;

public class LinkedListUS<D> {

    // Properties
    Node<D> head;
    int count;

    // Constructors
  /*  public LinkedListUS(){
        head = null;
        count = 0;
    }
    returns an error because if the
    head is null, then it can't progress
*/
    public LinkedListUS(Node<D> newHead){
        head = newHead;
        count = 1;
    }

    // Methods

    // add
    public void add(D newData){
        Node<D> temp = new Node(newData);
        Node<D> current = head;

        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public D get(int index){
        // Throw an error next time

       // if(index <= 0){
         //   return -1;
        //}
        Node<D> current = head;
        for (int i = 1; i < index; i++){
            current = current.getNext();
        }
        return  current.getData();
    }

    // size
    public int size(){
        return count;
    }

    // isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    // remove

    public void remove(){
        // Remove from the back of the list
        // Won't work with lists of 1 or smaller
        Node<D> current = head;
        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }



    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<String>();

        myLinkedList.add("First"); // adds a node with data="First" to back of the (empty) list
        myLinkedList.add("Second"); // adds a node with data="Second" to the back of the list
        myLinkedList.addFirst("Third"); // inserts a node with data="Third" at front of the list
        myLinkedList.addLast("Fourth"); // inserts a node with data="Fourth" at back of the list
        myLinkedList.add(2, "Fifth"); // inserts a node with data="Fifth" at index 2
        System.out.println(myLinkedList); // print the list: [Third, First, Fifth, Second, Fourth]

// Print the value at list index 2:
        System.out.println(myLinkedList.get(2));

// Empty the list
        myLinkedList.clear();
        System.out.println(myLinkedList); // print the newly emptied list: []

        myLinkedList.add("Sixth"); // adds a node with data="Sixth" to back of the (empty) list
        System.out.println(myLinkedList); // print the list: [Sixth]
    }
}
