package org.example.apitest;

import java.util.HashMap;
import java.util.Random;

public class Test<K, V> extends HashMap<K, V> {
    @Override
    public int hashCode() {
        return new Random().nextInt();
    }
}
