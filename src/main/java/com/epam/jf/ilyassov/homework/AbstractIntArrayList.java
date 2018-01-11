package com.epam.jf.ilyassov.homework;

public abstract class AbstractIntArrayList {

    protected int[] values;
    protected int length;

    public AbstractIntArrayList() {
        // TODO values (на 10 элементов)
        values=new int[10];
        length=0;
    }

    public AbstractIntArrayList(int capacity) {
        // TODO value[capacity]
        values=new int[capacity];
        length=0;
    }

    public AbstractIntArrayList(AbstractIntArrayList list) {
        // TODO конструктор копирования
        values=list.values;
    }

    public abstract boolean add(int value);

    public abstract boolean add(int value, int index);

    public abstract int get(int index);

    public abstract boolean contains(int value);

    public abstract boolean containsAll(AbstractIntArrayList list);

    public abstract int remove(int index);

    public abstract int set(int value, int index);

    public abstract boolean addAll(AbstractIntArrayList list);

    public abstract void clear();

    public abstract int size();

    public abstract boolean isEmpty();

    public abstract int indexOf(int value);

    public abstract int lastIndexOf(int value);

    public abstract AbstractIntArrayList subList(int fromInclusive, int toInclusive);
}