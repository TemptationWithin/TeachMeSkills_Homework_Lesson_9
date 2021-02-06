package com.homework_lesson_9;

import com.homework_lesson_9.collection.PersonalList;

/**
 * Реализовать свою собственную коллекцию(можно сказать, свой собственный ArrayList).
 * В этой коллекции должны быть
 * метод добавления элемента
 * метод получения элемента по индексу
 * метод удаления элемента по индексу
 * метод, возвращающий размер коллекции
 * Коллекция должны сама масштабироваться
 */
public class Main {
    public static void main(String[] args) {
        PersonalList<String> personalList = new PersonalList<>();
        personalList.add("FirstElement");
        personalList.add("SecondElement");
        personalList.add("ThirdElement");

        System.out.println("Original initialized list: ");
        for (String s: personalList) {
            System.out.println(s);
        }


        System.out.println(" ");
        System.out.println("Method GET: ");
        System.out.println(personalList.get(1));


        System.out.println(" ");
        System.out.println("Method UPDATE: ");
        personalList.update(1,"newElement");
        System.out.println(personalList.get(1));


        System.out.println(" ");
        System.out.println("Method DELETE: ");
        personalList.delete(2);
        for (String s : personalList) {
            System.out.println(s);
        }

        System.out.println(" ");
        System.out.println("Method SIZE: ");
        System.out.println(personalList.size());
    }
}
