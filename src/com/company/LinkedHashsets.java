package com.company;
import java.util.*;
public class LinkedHashsets {
    public static void main(String args[]){
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("C++");
        set.add("C#");
        set.add("C");
        set.add("C++");
        // printing
        System.out.println("Linked hashsets : "+set);


        //iterating using iterator method
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

