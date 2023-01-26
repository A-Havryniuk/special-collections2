package com.efimchick.ifmo.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class SortedByAbsoluteValueIntegerSet implements Set<Integer> {
    private Set<Integer> treeSet = new TreeSet<>(new SetComparator());

    @Override
    public int size() {
        return treeSet.size();
    }

    @Override
    public boolean isEmpty() {
        return treeSet.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return treeSet.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return treeSet.iterator();
    }

    @Override
    public Object[] toArray() {
        return treeSet.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return treeSet.toArray(a);
    }

    @Override
    public boolean add(Integer integer) {
        return treeSet.add(integer);
    }

    @Override
    public boolean remove(Object o) {
        return treeSet.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return treeSet.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return treeSet.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return treeSet.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return treeSet.retainAll(c);
    }

    @Override
    public void clear() {
        treeSet.clear();
    }
}
