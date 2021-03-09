package com.learningJavaLanguage.generics;

import java.util.ArrayList;
import java.util.List;

public class OrderedPair<K,V> implements Pair<K,V> {
    private K key;
    private V value;

    @Override
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    /*// Upper bound: Must be of typeFfoo or any type which is Foo
    public static void process(List<? extends Foo> list) {
        for (Foo elem : list) {
            // ...
        }
    }
    //Unbounded <?> Any type
    public static void printList(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }

    //Lower bounded - matches Integer or any type supertype of integer
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
*/

    public static void main(String[] args) {
        OrderedPair<String, Object> pair = new OrderedPair<>();
        // Super class of List<integer> and List<Number> is List<?>.
        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number>  numList = intList;  // OK. List<? extends Integer> is a subtype of List<? extends Number>

    }
}