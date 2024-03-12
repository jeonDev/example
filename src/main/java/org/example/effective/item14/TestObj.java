package org.example.effective.item14;

import org.jetbrains.annotations.NotNull;

public class TestObj implements Comparable {
    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}
