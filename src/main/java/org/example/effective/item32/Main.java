package org.example.effective.item32;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

//        String[] a = {"1"};
//        Integer[] b = {1};
//        Double[] c = {2.0};
//        System.out.println(pickTwo(a, b, c));
        List<String> stringList = pickTwoList("좋은", "빠른", "저렴한");
        String[] strings = pickTwo("좋은", "빠른", "저렴한");
    }

    static <T> T[] toArray(T ...args) {
        return args;
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(a, c);
            case 2: return toArray(b, c);
        }
        throw new AssertionError();
    }
    static <T> List<T> pickTwoList(T a, T b, T c) {
        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return List.of(a, b);
            case 1: return List.of(a, c);
            case 2: return List.of(b, c);
        }
        throw new AssertionError();
    }

}
