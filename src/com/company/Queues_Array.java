package com.company;
import java.util.*;
public class Queues_Array {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("HTML");
        deque.add("CSS");
        deque.add("JavaScript");
         //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}

