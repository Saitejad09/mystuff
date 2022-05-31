package org.jsp.app;

import java.util.ArrayList;

public class InsetArray {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
       // ArrayList<String> cloned = new ArrayList<>();
        arr.add("Hello");
        arr.add("Hi");
        arr.add("How1");
        arr.add("Are");
       // cloned.add("Arre");
    System.out.println(arr);
    for (int i = 0;i<arr.size();i++){
           System.out.println(arr.get(i));
        }
//        System.out.println(cloned);

        //    cloned.addAll(arr);
        //System.out.println(cloned);
    }
}
