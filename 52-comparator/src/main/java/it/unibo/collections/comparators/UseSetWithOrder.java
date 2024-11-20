package it.unibo.collections.comparators;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param s
     *            ignored
     */
    public static void main(final String[] s) {

        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings.
         * To order the set, define a new Comparator in a separate class.
         * The comparator must convert the strings to double, then compare the doubles to find the biggest.
         * The comparator does not need to deal with the case of Strings which are not parseable as doubles.
         */
        Collection<String> tree = new TreeSet<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                double d1 = Double.parseDouble(o1);
                double d2 = Double.parseDouble(o2);
                if(d1 - d2 > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        /*
         * 2) Inserts in the set a hundred strings containing randomly generated numbers
         * (use Math.random(), and convert to String appropriately)
         */
        for(int i = 0; i<100; i++) {
            tree.add(String.valueOf(Math.random()));
        }
        /*
         * 3) Prints the set, which must be ordered
         */
        System.out.println(tree);
    }
}
