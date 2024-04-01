package org.example.effective.item26;

import java.util.HashSet;
import java.util.Set;

public class Main3 {

    public static void main(String[] args) {
        HashSet<Object> object1 = new HashSet<>();
        HashSet<Object> object2 = new HashSet<>();
        numElementsInCommon(object1, object2);
    }
//    static int numElementsInCommon(Set s1, Set s2) {
//        int result = 0;
//        for (Object o1 : s1)
//            if(s2.contains(o1))
//                result++;
//        return result;
//    }

    static int numElementsInCommon(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1)
            if(s2.contains(o1))
                result++;
        return result;
    }
}
