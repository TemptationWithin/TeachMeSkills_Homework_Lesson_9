package com.homework_lesson_9.collection;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator {
    private  int index = 0;
    T[] values;

    ArrayIterator(T[] values){
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values[index++];
    }
}
