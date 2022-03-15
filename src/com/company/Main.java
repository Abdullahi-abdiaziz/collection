package com.company;
import java.util.*;
class Student {
    int roll_no;
    String name;
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        //list1 can only store string objects
        ArrayList<String> list1=new ArrayList<String>(); // specific Data Type
    //list2 can store any object
        ArrayList list2=new ArrayList<>(); // Any Data Type

        Student s1=new Student();
        s1.name="Farah";
        s1.roll_no=8;


        //1.Add Data into Lists
        list1.add("Egypt");
        list1.add("Sudan");
        list1.add("Algeria");
        list1.add("Tunisia");
        list1.add("Morocco");
        //list1.add(2); error b/c the list one can only store String objects

        list2.add("Mars");// you can store any data type in list2
        list2.add(2);
        list2.add('c');
        list2.add(s1);

        //printing The references
        System.out.println("Countries is : "+list1);
        System.out.println("Objects is : "+list2); // the compiler prints The HashCode of S1 object at last object of list3

        System.out.println("-----------------------------------------");

        //2.Get the Element From List
        String gt1=list1.get(2);
        System.out.println("Accessing the Element lists1 : "+gt1);

        Object gt2=list2.get(2);
        System.out.println("Accessing the Element lists1 : "+gt2);

        System.out.println("----------------------------------------");

        //3.Update the element in the list
        list1.set(2,"lebanon");
        System.out.println("Countries After updating : "+list1);

        list2.set(2,'P');
        System.out.println("Objects After updating : "+list2);

        System.out.println("----------------------------------------");

        //4.Remove element From List
        list1.remove(1);
        System.out.println("Countries After removing  : "+list1);
        // list1.clear(); to remove all element in the list1

        // also we use the contains() to check The elements is in the list
        if (list1.contains("Egypt")) {
            System.out.println("Egypt is in the list");
        }

        System.out.println("----------------------------------------");

        //5. Iterating in ArrayList
        System.out.println("==Iterating With enhanced for loop==");
        for (String str : list1) {
            System.out.println(str);
        }
        System.out.println("==Iterating With traditional for loop==");
        for(int i=0;i< list1.size();i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("==Iterating With Iterator ==");
        Iterator<String> itr=list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("---------------------END-------------------");

    }
}
