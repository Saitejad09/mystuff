package org.jsp.app;

import java.util.ArrayList;

public class UpdateElement {
    //Update the specified index position
    public static void main(String[] args) {
        ArrayList<String> a1= new ArrayList<>();

        a1.add("abc");
        a1.add("def");
        a1.add("ghi");
        //print the original array
        System.out.println(a1);

        //updating the array by using set()
        a1.set(1,"zxc");
        System.out.println(a1);
    }
}
