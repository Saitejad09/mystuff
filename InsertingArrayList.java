package org.jsp.app;

import java.util.ArrayList;

public class InsertingArrayList {
    //Wap to insert elements into the array list at the first poistion
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("chintu");
        a1.add("sai");
        a1.add("teja");

        a1.add(1,"vishu");
        System.out.println(a1);
    }

}
