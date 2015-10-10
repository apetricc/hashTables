/**
 * Created by aj on 10/10/15.
 */

/**
 * 24 points: After your ChainedHashTable class is working, create another separate Java class called
 * OpenAddressedHashTable in the same package, based on a hash table with open addressing using linear probing
 * from the slides/textbook. Your should use an array of Integer objects as your primary instance variable / data
 * field. The auxiliary hash function should use the multiplication method or can come from a universal
 * collection -- either way, you can reuse your hash function from the ChainedHashTable class.
 The constructor should have a parameter for n, the total number of inputs expected. In the constructor,
 create the array of size m as an array of Integer of the same array length as the ChainedHashTable class's array.
 There should also be public methods for insert, delete, and search as in the slides/textbook. To facilitate your
 delete method, you may want to define a static final int instance variable / class data field named DELETED,
 whose value is Integer.MIN_VALUE.
 I also want a public printTable method, which runs a loop and prints each Integer in the hash table.
 With Java's handy auto-unboxing feature, this will be a very straight-forward printing loop.
 You will need a private helper method with one parameter named hash, to implement the auxiliary hash function.
 You will need another private helper method with two parameters named hash, to implement the primary hash
 function. Given a key and an "index" into the probe sequence, it returns the appropriate element of the probe
 sequence, which is an index into the hash table's main array. It will do this by invoking the
 one-parameter hash method.
 */
public class OpenAddressedHashTable {
}
