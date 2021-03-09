package com.learningJavaLanguage.generics;

import java.util.Arrays;
import java.util.Collection;

public class GenericEx {
    //count the number of elements in a collection that have a specific property

    public static <T> Integer countOdd(Collection<T> colOfItems, Testable<T> t){
        Integer cnt = 0;
        for (T entry : colOfItems){
            if(t.test(entry))
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Collection<Integer> c1 = Arrays.asList(1,3,4,5,6);
        System.out.println("Odd numbers are "+ countOdd(c1, new TestOdd()));

    }

}
