package collections.interfaces.exercises;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintRandomOrderArgs {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (String arg:
             args) {
            list.add(arg);
        }

        System.out.println(list);

        //Shuffle using static method of collections
        Collections.shuffle(list, new Random());

        System.out.println(list);
    }
}
