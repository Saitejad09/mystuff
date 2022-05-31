package org.jsp.app;

import java.util.ArrayList;
import java.util.Collections;

public class ReversingElements {
    public static void main(String[] args) {
        //Reverse the elements of given arraylist
        ArrayList<String> a1= new ArrayList<>();

        a1.add("men");
        a1.add("women");
        a1.add("Others");
        //Before reversing the elements
        System.out.println(a1);
        //After reverscing the elements
        //here we use Collections.reverse() method
        Collections.reverse(a1);
        System.out.println(a1);
        System.out.println("-------------------------------");


        ArrayList<Integer> a2= new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);
        //Before reversce the array
        System.out.println(a2);

        //By usng Collections.reversce() method
        Collections.reverse(a2);
        System.out.println(a2);

    }
}
