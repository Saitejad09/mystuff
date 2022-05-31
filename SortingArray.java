package org.jsp.app;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArray {
    //WAP to sorting the given array
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Hyderabad");
        a1.add("karimanagar");
        a1.add("telangana");
        a1.add("Vizag");

        //print the original array
        System.out.println(a1);
        //sorting the array
        Collections.sort(a1);
        System.out.println(a1);

        ArrayList<Integer> a2= new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(5);
        a2.add(4);
        a2.add(6);
        //printing original array
        System.out.println(a2);
        //by using Collections.sort() method
        Collections.sort(a2);
        System.out.println(a2);


    }
}
