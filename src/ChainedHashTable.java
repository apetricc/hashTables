/**
 * Created by aj on 10/10/15.
 */
public class ChainedHashTable {

    /**
     * 24 points: Implement a Java class named ChainedHashTable, based on a hash table with chaining using the
     * multiplication method from the slides/textbook. Your should use an array of LinkedList<Integer> objects
     * as your primary instance variable / data field.
     The constructor should have a parameter for n, the total number of inputs expected. In the constructor,
     create the array of size m as the first power of 2 larger than n, full of constructed but empty linked lists
     at each index. You may choose A directly, or use the integer fraction method.
     There should also be public methods for insert, delete, and search as in the slides/textbook.
     I also want a public printTable method, which runs a loop and prints each linked list in the hash table;
     consider using the LinkedList class toString method.
     You will need a private helper method named hash. Given an int key, it computes and returns an int index
     of the table.

     5 points extra credit: Use a Universal collection of hash functions instead of the multiplication method,
     for the ChainedHashTable class above. The random constants a and b, and the prime number p > m should be chosen
     in the constructor.
     */
    public ChainedHashTable() {
    }
}
