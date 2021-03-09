package collections.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);


    }

    public <E> int indexOf(List<E> list, E e) {
        for (ListIterator<E> it = list.listIterator(); it.hasNext(); )
            if (e == null ? it.next() == null : e.equals(it.next()))
                return it.previousIndex();
        // Element not found
        return -1;
    }

    public static <E> void replace(List<E> list, E val, E newVal) {
        for (ListIterator<E> it = list.listIterator(); it.hasNext(); )
            if (val == null ? it.next() == null : val.equals(it.next()))
                it.set(newVal);
    }


}
