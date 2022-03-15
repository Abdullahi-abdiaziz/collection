package com.company;
import java.util.*;
public class arrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(8);
        list.add(98);
        list.add(67);


        list.remove(2);
        list.add(2,65);
        list.add(2,75);

        Iterator itr=list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
