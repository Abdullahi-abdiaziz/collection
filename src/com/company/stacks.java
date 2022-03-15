package com.company;
import java.util.*;
public class stacks {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Web 3.0");
        stack.push("Web 2.0");

        System.out.println("Top : "+stack.peek());

        stack.push("Web 1.0");
        stack.push("Intermet 3.0");

        stack.push(stack.pop());

        System.out.println("Top : "+stack.peek());

        stack.pop();
        stack.push(stack.pop());

        Iterator<String> itr=stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Top : "+stack.peek());
    }
}
