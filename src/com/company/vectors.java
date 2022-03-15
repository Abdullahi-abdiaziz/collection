package com.company;
import java.util.*;
public class vectors {
    public static void main(String[] args) {
        Vector<String> vec=new Vector<String>();
        vec.add("java");
        vec.add("python");
        vec.add("c++");
        vec.add("solidity");
        vec.add("flutter");

        Iterator<String> itr=vec.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
