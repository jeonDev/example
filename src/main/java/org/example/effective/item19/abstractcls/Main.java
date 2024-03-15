package org.example.effective.item19.abstractcls;

import org.example.effective.item19.abstractcls.InstrumentedHashSet;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("틱", "탁탁", "펑"));
        System.out.println(s.getAddCount());
    }
}
