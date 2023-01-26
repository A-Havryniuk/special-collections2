package com.efimchick.ifmo.collections;

import java.util.*;



class MedianQueue implements Queue<Integer> {
    LinkedList<Integer> medianQueue = new LinkedList<>();

    @Override
    public int size() {
        return medianQueue.size();
    }

    @Override
    public boolean isEmpty() {
        return medianQueue.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<Integer> iterator() {
        return medianQueue.iterator();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Integer integer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        medianQueue.clear();
    }

    @Override
    public boolean offer(Integer integer) {
        if(integer == null)
            return false;
        medianQueue.addLast(integer);
        medianQueue.sort(new comparatorQueue());
        return true;
    }

    @Override
    public Integer remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Integer poll() {
        return medianQueue.remove((medianQueue.size()-1)/2);
    }

    @Override
    public Integer element() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Integer peek() {
        return medianQueue.get((medianQueue.size()-1)/2);
    }

}
