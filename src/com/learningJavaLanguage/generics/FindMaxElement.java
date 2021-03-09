package com.learningJavaLanguage.generics;

import java.util.*;

public class FindMaxElement {
    public static <T extends Comparable<T>> T findMaxEl(List<T> list, Integer begin, Integer end ){
        T maxEl = list.get(begin);
        for(int i = begin + 1; i < end; i++){
                if (list.get(i).compareTo(maxEl) > 0 )
                    maxEl = list.get(i);
            }
        return maxEl;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,4,3,7);
        System.out.println("Max Element in range 1-3 is " + findMaxEl(list,1,3));
    }
}

