package com.epam.jf.ilyassov.homework;

/**
 * Список, построенный на основе массива.
 * Позволяет хранить значения любых ссылочных типов.
 */
public abstract class AbstractObjectArrayList {

    protected Object[] values;
    protected int size;

    public AbstractObjectArrayList() {
        // TODO values (на 10 элементов)
        this.values=new Object[10];
        size=0;
    }

    public AbstractObjectArrayList(int capacity) {
        // TODO value[capacity]
        this.values=new Object[capacity];
        size=0;
    }

    public AbstractObjectArrayList(AbstractObjectArrayList list) {
        // TODO конструктор копирования
        values=new Object[list.values.length];
        size=list.size();
        System.arraycopy(list.values,0,values,0,list.size());
        }


    protected void ensureCappacity(int n){
        if(n>values.length)
        {
            System.out.println("enter");
            Object[] objects = new Object[values.length*2];
            System.arraycopy(values,0,objects,0,size);
            values=objects;
        }
    }

    public abstract boolean add(Object value);

    public abstract boolean add(Object value, int index);

    public abstract Object get(int index);

    public abstract boolean contains(Object value);

    public abstract boolean containsAll(AbstractObjectArrayList list);

    public abstract Object remove(int index);

    public abstract Object remove(Object value);

    public abstract boolean removeAll(AbstractObjectArrayList list);

    public abstract Object set(Object value, int index);

    public abstract boolean addAll(AbstractObjectArrayList list);

    public abstract void clear();

    public abstract int size();

    public abstract boolean isEmpty();

    public abstract int indexOf(Object value);

    public abstract int lastIndexOf(Object value);

    public abstract AbstractObjectArrayList subList(int fromInclusive, int toInclusive);

    public abstract void trimToSize();
}
