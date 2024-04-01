package org.example.effective.item26;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings,Integer.valueOf(42));
        String s = strings.get(0);
    }
    private static void unsafeAdd(List<String> list, Object o) {
//        list.add(o);
    }
}
