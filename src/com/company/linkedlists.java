package com.company;
import java.util.*;
public class linkedlists {
    public static void main(String[] args) {
        LinkedList<String> link=new LinkedList<String>();
        link.add("musa");
        link.add("Abdallah");
        link.add("farah");
        link.add("gulled");
        link.add("saed");

        link.remove(2);
        link.add(2,"madjid");
        link.add(2,"ibrahem");

        Iterator<String> itr=link.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("-------------------------------------");
        LinkedList<String> languages=new LinkedList<>();

        //Add Elements
        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");
        System.out.println("LinkedList : "+languages);

        //remove an element from the front
        String str1= languages.poll();

        //print the removed element
        System.out.println("Removed Element : "+str1);

        System.out.println("LinkedList after poll() : "+languages);

        //add element in the back
        languages.offer("Swift");
        System.out.println("LinkedList after offer() : "+languages);
    }
}
