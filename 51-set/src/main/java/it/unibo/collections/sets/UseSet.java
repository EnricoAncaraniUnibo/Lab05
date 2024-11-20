package it.unibo.collections.sets;

import java.util.Collection;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 * @param <X>
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        Collection<String> tree = new TreeSet<>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for(int i=1; i<21; i++) {
            tree.add(String.valueOf(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.println(tree);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        for (String string : tree) {
            if(Integer.parseInt(string) % 3 == 0) {
                tree.remove(string);
            }
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for (String string : tree) {
            System.out.println(string + "\n");
        }
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        System.out.println(containsOnlyEven(tree));
        }
        
        public static boolean containsOnlyEven(Collection<String> collection) {
        for (String x : collection) {
            if(Integer.parseInt(x) % 2 != 0)
            {
                return false;
            }
        }
        return true;
    }
}
