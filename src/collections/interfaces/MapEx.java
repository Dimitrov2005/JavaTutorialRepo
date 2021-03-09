package collections.interfaces;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {

        /*
        if (m1.entrySet().containsAll(m2.entrySet())) {
        }
        if (m1.keySet().equals(m2.keySet())) {
        }
        */
    }

    static <K, V> boolean validate(Map<K, V> attrMap, Set<K> requiredAttrs, Set<K>permittedAttrs) {
        boolean valid = true;
        Set<K> attrs = attrMap.keySet();

        if (! attrs.containsAll(requiredAttrs)) {
            Set<K> missing = new HashSet<K>(requiredAttrs);
            missing.removeAll(attrs);
            System.out.println("Missing attributes: " + missing);
            valid = false;
        }
        if (! permittedAttrs.containsAll(attrs)) {
            Set<K> illegal = new HashSet<K>(attrs);
            illegal.removeAll(permittedAttrs);
            System.out.println("Illegal attributes: " + illegal);
            valid = false;
        }
        return valid;
    }
}
