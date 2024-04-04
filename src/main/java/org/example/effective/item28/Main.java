package org.example.effective.item28;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Object> list = new ArrayList<Long>();
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add(1);
        for(Object l : list) System.out.println(l);

        Object[] array = new Integer[2];
        array[0] = "ddd"; // ArrayStoreException

//        List<String>[] stringLists = new List<String>[1];
//        List<Integer> intList = List.of(42);
//        Object[] objects = stringLists;
//        objects[0] = intList;
//        String s = stringLists[0].get(0);
    }
}
