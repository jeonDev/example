package org.example.effective.item19;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class ForwardingSet<E> implements Set<E> {
    private final Set<E> s;

    public ForwardingSet(Set<E> s) {
        this.s = s;
    }

    public void clear() {
        s.clear();
    }

    public boolean contains(Object o) {
        return s.contains(o);
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    public int size() {
        return s.size();
    }

    public Iterator<E> iterator() {
        return s.iterator();
    }

    public boolean add(E e) {
        return s.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return s.remove(o);
    }

    public boolean containsAll(@NotNull Collection<?> c) {
        return s.containsAll(c);
    }

    public boolean addAll(@NotNull Collection<? extends E> c) {
        return s.addAll(c);
    }

    public boolean removeAll(@NotNull Collection<?> c) {
        return s.removeAll(c);
    }

    public boolean retainAll(@NotNull Collection<?> c) {
        return s.removeAll(c);
    }

    public Object[] toArray() {
        return s.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return s.toArray(a);
    }

    @Override
    public boolean equals(Object obj) {
        return s.equals(obj);
    }

    @Override
    public int hashCode() {
        return s.hashCode();
    }

    @Override
    public Spliterator<E> spliterator() {
        return s.spliterator();
    }

    @Override
    public String toString() {
        return s.toString();
    }
}
