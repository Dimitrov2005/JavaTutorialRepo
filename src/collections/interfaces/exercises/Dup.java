package collections.interfaces.exercises;

import java.util.*;

public class Dup {

    public static void main(String[] args) {
        SortedSet<String> s =  new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}
