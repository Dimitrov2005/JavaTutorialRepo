package collections.interfaces.exercises;

import java.util.*;

//Write a method that takes a List<String> and applies String.trim to each element.
public class Trim {

    public static void trimListElements(List<String> list){
        for (ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext(); ) {
            listIterator.set(listIterator.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("    aaa   ", "B    b");
        System.out.println(list);
        trimListElements(list);
        System.out.println(list);
    }

}
