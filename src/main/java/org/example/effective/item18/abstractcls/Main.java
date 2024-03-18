package org.example.effective.item18.abstractcls;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("틱", "탁탁", "펑"));
        System.out.println(s.getAddCount());
    }
}
