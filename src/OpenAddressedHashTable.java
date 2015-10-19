/**
 * Andrew Petriccione csci 333 homework 6--hash tables
 */

/**
 * The openAddressedHashTable class makes a hash table using the open
 * addressed hash table algorithm
 */
public class openAddressedHashTable {
    private int m;
    private Integer[] theList;
    private static int DELETED = Integer.MIN_VALUE;
    private static double A = 0.618;

    /**
     * The openAddressedHashTable constructor method creates an open addressed
     * hash table using the algorithm for open addressed hash tables
     * @param n The total number of input elements in the open addressed hash table.
     */
    public openAddressedHashTable(int n) {
        m = 1;
        while (m <= n) {
            m *= 2;
        }
        theList = new Integer[m];
    }

    /**
     * The insert method inserts a value into the hash table
     * @param n the value to be inserted
     * @return the index where the key was placed in the hash table, or else NULL
     * if the table is full
     */
    public Integer insert(Integer n) {
        int k = n.intValue();
        for (int i = 0; i < m; i++) {
            Integer j = hash(k, i);
            if (theList[j] == null) {
                theList[j] = n;
                return j;
            }
        }
        System.out.println("Hash Table Overflow");
        return null;
    }

    /**
     *The delete method removes a key from the hash table.
     * @param n the key to be removed from the hash table
     * @return the index where the deleted element was in the hash table,
     * or else NULL if the key wasn't found
     */
    public Integer delete(Integer n) {
        int k = n.intValue();
        for (int i = 0; i < m; i++) {
            Integer j = hash(k, i);
            if (theList[j] == k) {
                theList[j] = DELETED;
                return j;
            }
        }
        System.out.println("Element not found");
        return null;
    }

    /**
     *  The search method looks in the hash table for the key given
     * @param k the key to search for
     * @return the index where the key is if it's found,
     * else return NULL if key not found
     */
    public Integer search(int k) {
        for (int i = 0; i < m; i++) {
            Integer j = (int) hash(k, i);
            //if (theList[j] == DELETED) return null ?;
            if (theList[j] == null) return null;
            if (theList[j] == k) return theList[j];
        }
        return null;
    }

    /**
     * The printTable method converts the table into a String that can be printed
     * @return The String to be printed
     */
    public String printTable() {
        String result = "";
        for (int i = 0; i < theList.length; i++) {
            if (theList[i] != null)
                result += "[" + theList[i].toString() + "]";
            else result += "[]";
        }
        return result;
    }

    /**
     * the auxiliary hash method is a helper method for the main hash method
     * @param k the key to insert into the hash table
     * @return the index where the key k will be placed in the hash table
     */
    private int hash(int k) {
        double hashTag = (m * (k * A % 1));
        return (int) hashTag;
    }

    /**
     * This hash function uses probing to place keys into the hash table.
     * @param k The key to be inserted into the hash table
     * @param i the distance to the next location on the hash table.
     * @return the index of where to place key k in the hash table.
     */
    private int hash(int k, int i) {
        int hashTag = (hash(k) + i) % m;
        return hashTag;
    }
}
