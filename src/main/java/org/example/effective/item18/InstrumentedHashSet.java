package org.example.effective.item18;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Set;

public class InstrumentedHashSet<E> extends ForwardingSet<E> {
    // 추가된 원소의 수
    private int addCount = 0;

    public InstrumentedHashSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
