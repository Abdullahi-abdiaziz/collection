package com.company;
import java.util.*;
public class Hashsets {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("C++");
        set.add("C#");
        set.add("C");
        set.add("C++");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------------------------------");
        //finding union of two sets
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(2);
        numbers.add(4);
        System.out.println("Set1 : "+numbers);

        HashSet<Integer> primeNumbers=new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("Set2 : "+primeNumbers);

        //Union of two sets
        numbers.addAll(primeNumbers);
        System.out.println("Union : "+numbers);

        //Difference between two hashsets
        numbers.removeAll(primeNumbers);
        System.out.println("difference of numbers: "+numbers);


    }
}

