package com.company;
import java.util.*;
public class Queues_Priority {
    public static void main(String[] args) {
        PriorityQueue<String> Queue;
        Queue = new PriorityQueue<String>();
        Queue.add("Computer Organization");
        Queue.add("Computer Architecture");
        Queue.add("CompTIA A+");
        Queue.add("Java Advance");

        System.out.println("Head : "+Queue.element());

        Queue.add(Queue.remove());

        System.out.println("Head : "+ Queue.peek());

        System.out.println("Iterating The Elements ");

        Iterator<String> itr=Queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Queue.remove();
        Queue.remove();

        System.out.println("After Removing two Elements : ");

        Iterator<String> itr1=Queue.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}
