package org.jsp.app;

import java.util.ArrayList;

public class RetriveElements {
    //WAP retrive an element at specified index from giveen array list
    public static void main(String[] args) {
        ArrayList<String> a1= new ArrayList<>();
        a1.add("java");
        a1.add("sql");
        a1.add("j2ee");
      //  a1.get(1);
        // retriving the element at specified index position
        System.out.println(a1.get(2));
        ArrayList<Integer> a2= new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        //y using get() method retrive the elements
        System.out.println(a2.get(0));


    }
}
