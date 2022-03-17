package com.isep;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExemple {
    public static void main(String [] args){
        Queue queue = new LinkedList();
        queue.offer("Green");
        boolean isInserted = queue.offer("Blue");

        System.out.println(isInserted);
///////////////////////////////////////
        ///////Queue queue = new LinkedList();
        try {
            queue.add("Green");
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
        }
        System.out.println(queue.peek());


    }
}
