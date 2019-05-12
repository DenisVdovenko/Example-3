package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrayList= new ArrayList<>();
        List<Integer> linkedList= new LinkedList<>();
        Set<Integer> hashSet= new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        System.out.println("test add for hashSet: " + TestUtils.testAddToCollection(hashSet));
        System.out.println("test add for treeSet: " + TestUtils.testAddToCollection(treeSet));
        System.out.println("test add for arrayList: " + TestUtils.testAddToCollection(arrayList));
        System.out.println("test add for linkedList: " + TestUtils.testAddToCollection(linkedList));
        /*
        ArrayList представляет собой массив, в связи с этим добавление элементов в него производится наиболее быстро.
        LinkedList представляет собой связанный список, индексы элементов отсутствуют, за счёт чего приходится каждый
        раз при добавлении пробегать итератором по всему списку.
        В HashSet время на добавление затрачивается на расчёт хеш-кода элемента и запись в хеш-таблицу.
        TreeSet затрачивается наибольшее время за счёт осуществления сортировки в добавляемых элементах при записи.
         */


        System.out.println("test add to the beginning for arrayList: " + TestUtils.testAddToTheBeginning(arrayList));
        System.out.println("test add to the beginning for linkedList: " + TestUtils.testAddToTheBeginning(linkedList));
        System.out.println("test add to the end for linkedList: " + TestUtils.testAddToTheEnd(linkedList));
        System.out.println("test add to the end for arrayList: " + TestUtils.testAddToTheEnd(arrayList));
        /*
        Время добавления элементов в начало коллекции ArrayList существенно больше чем в LinkedList.
        Время добавления элементов в конец коллекции ArrayList соизмеримо с LinkedList.
        В ArrayList при добавлении элементов в начало производится сдвиг всей коллекции на одну позицию (переписывается
        весь массив). При добавлении в конец дописывается новый элемент в конце коллекциии.
        В LinkedList при добавлении элементов в начало и в конец коллекции производится изменение ссылок в соседних
        элементах.
         */


        TestUtils.testAddToCollection(hashSet);
        TestUtils.testAddToCollection(treeSet);
        System.out.println("test contains for hashSet: " + TestUtils.testContains(hashSet));
        System.out.println("test contains for treeSet: " + TestUtils.testContains(treeSet));
        /*
        Метод contains у коллекции hashSet работает быстрее чем у коллекции treeSet.
         */

        TestUtils.testAddToCollection(arrayList);
        TestUtils.testAddToCollection(linkedList);
        TestUtils.testAddToCollection(hashSet);
        System.out.println("test contains for linkedList: " + TestUtils.testContains(linkedList));
        System.out.println("test contains for hashSet: " + TestUtils.testContains(hashSet));
        System.out.println("test contains for arrayList: " + TestUtils.testContains(arrayList));
        /*
        Скорость доступа при проверке contains к HashSet самая высокая за счёт того что мы обращаемся не к самому
        массиву данных, а к хеш-таблице. В коллекции ArrayList мы проходим по элементам, скорость прохода соизмерима с
        простым массивом.
        В LinkedList время на метод contains самое большое; по элементно перебирается список с выяснением следующего
        элемента и проверкой содержимого.
         */
    }
}
