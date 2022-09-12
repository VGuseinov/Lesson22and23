package com.company;

import java.util.*;

public class TenetList<E> implements List<E> {

    private class MyIterator implements Iterator<E> {
        /* сколько эжлементов
        нужно отступить с конца списка
         */
        private int count = 1;

        @Override
        public boolean hasNext() {
            if (list.isEmpty()) {
                return false;
            }
            return count <= list.size();
        }

        @Override
        public E next() {

            return list.get(list.size() - this.count++);
        }
    }

    private LinkedList<E> list;

    public TenetList() {
        this.list = new LinkedList<>();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    @Override
    public boolean add(E e) {
        return this.list.add(e);
    }

    @Override
    public E get(int index) {
        return this.list.get(index);
    }

    ////////////////////////////////

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }


    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
