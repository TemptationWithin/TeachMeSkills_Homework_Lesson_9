package com.homework_lesson_9.collection;

import java.util.Iterator;

/**
 * Реализовать свою собственную коллекцию(можно сказать, свой собственный ArrayList).
 * В этой коллекции должны быть
 * метод добавления элемента
 * метод получения элемента по индексу
 * метод удаления элемента по индексу
 * метод, возвращающий размер коллекции
 * Коллекция должны сама масштабироваться
 */

public class PersonalList<E> implements I_SimpleCollection<E> {

    private E[] values;

    public PersonalList(){
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E element) {
        try{
            E[] array = values;
            values = (E[]) new Object[array.length+1];
            System.arraycopy(array,0,values,0, array.length);
            values[values.length-1] = element;
            return true;
        } catch (ClassCastException exception){
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            E[] array = values;
            values = (E[]) new Object[array.length-1];
            System.arraycopy(array,0,values,0,index);
            int sizeAfterIndex = array.length - index - 1;
            System.arraycopy(                             // COPY:
                            array,index+1,          // from {array, from index}
                            values,index,                 // to   {array, from index}
                            sizeAfterIndex);              // how much elements
        } catch (ClassCastException exception){
            exception.printStackTrace();
        }

    }

    @Override
    public E get(int index) {
        return values[index];
    }


    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E element) {
        values[index] = element;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }
}

