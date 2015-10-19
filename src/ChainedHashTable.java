/**
 * CSCI 333 Homework 6-- Hashing.
 * Created by Andrew Petriccione on 10/10/15.
 * The point of this homework is to implement Hash Tables
 * <p/>
 * The ChainedHashTable class is based on a hash table with chaining using the multiplication method
 * from the slides and book. It uses an array of LinkedList<Integer> objects as its primary
 * instance variable/data field
 */

import java.util.LinkedList;

public class ChainedHashTable {
    private LinkedList<Integer>[] theList;
    private int m;
    private static final double A = 0.618;

    /**
     * This constructor method creates a chained hash table and initializes each index with a new linked list.
     * @param n The size of the chained hash table to be created.
     */
    public ChainedHashTable(int n) {
        m = 1;
        while (m <= n) {
            m *= 2;
        }

        theList = new LinkedList[m];
        for (int i = 0; i < theList.length; i++) {
            theList[i] = new LinkedList();
        }
    }

    /**
     *  Insert the value into the hash table.
     * @param n the integer to add to the Chained hash table
     */
    public void insert(Integer n) {
        theList[hash(n)].addFirst(n);
    }

    /**
     *  Delete removes the element n from the hash table.
     * @param n The element to be removed
     */
    public void delete(Integer n) {
        theList[hash(n)].removeFirstOccurrence(n);
    }

    /**
     * the Search method determines whether a key is in the hash table
     * @param k the key to search for
     * @return the index where the key is located in the hash table, or else NULL
     */
    public Integer search(int k) {
        int target = hash(k);
        Integer index = theList[target].indexOf(k);
        if (index < 0) return null;
        else return theList[target].get(index);
    }

    /**
     * The print table method prints the contents of the hash table.
     * @return The String that can be printed
     */
    public String printTable() {
        String result = "";
        for (int i = 0; i < theList.length; i++) {
            result += theList[i];
        }
        return result;
    }

    /**
     * The hash method chooses the index to insert a key into the hash table.
     * @param key  The integer to be inserted.
     * @return The index where the key will be added to the hash table.
     */
    private int hash(int key) {
        double hashValue = m * (key * A % 1);
        return (int) hashValue;
    }
}
