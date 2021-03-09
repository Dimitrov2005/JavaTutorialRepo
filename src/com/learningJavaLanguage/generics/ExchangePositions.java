package com.learningJavaLanguage.generics;

public class ExchangePositions {
    public static <T> void exchangePosition(T[] array, Integer p1, Integer p2){
        T tempEl = array[p1];
        array[p1] = array[p2];
        array[p2] = tempEl;
    }
}
