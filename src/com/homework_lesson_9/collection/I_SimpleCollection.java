package com.homework_lesson_9.collection;
/**
 * Реализовать свою собственную коллекцию(можно сказать, свой собственный ArrayList).
 * В этой коллекции должны быть
 * метод добавления элемента
 * метод получения элемента по индексу
 * метод удаления элемента по индексу
 * метод, возвращающий размер коллекции
 * Коллекция должны сама масштабироваться
 */
public interface I_SimpleCollection<E> extends Iterable<E>{
    boolean add(E element);
    E get(int index);
    void delete(int index);
    int size();
    void update(int index, E element);


}
