package com.kevinmichie;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey <D>{

    LinkedList <D> queue;

    // Making a queue instance
    public Queuey(){
        queue = new LinkedList();
    }

    // Is our queue empty?
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // Enqueueing an item --> FIFO, First In, First Out
    public void enqueue(D n){
        queue.addLast(n); // adding item in Nth position
    }

    // Dequeueing an item --> Removes item at a position
    public D dequeue(){
        return queue.remove(0); // This removes the first item
    }

    // Peek at the first item
    public D peek(){
        return queue.get(0); // Takes a peek at a position and leaves the List as is.
    }

    public static void main(String[] args) {
        // Stacks are LIFO, Last In, First Out
        Stack<String> stacky = new Stack<>();
        stacky.push("there!"); //push in from on top
        stacky.push("hi "); //added to the top of the stack
        System.out.print(stacky.pop());
        System.out.println(stacky.pop());

        System.out.println();

        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(9);

        System.out.println("This is the 1st item: "+ numberQueue.dequeue());
        System.out.println("This is the 2nd item: "+ numberQueue.dequeue());
        System.out.println("This is the 3rd item: "+ numberQueue.dequeue());

    }
}
