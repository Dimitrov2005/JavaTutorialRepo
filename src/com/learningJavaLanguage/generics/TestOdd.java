package com.learningJavaLanguage.generics;

public class TestOdd implements Testable<Integer> {
    public boolean test(Integer i) {
        return i % 2 != 0;
    }
}
