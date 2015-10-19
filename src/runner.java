/**
 * * CSCI 333 Homework 6-- Hashing.
 * Created by Andrew Petriccione on 10/10/15.
 * The point of this homework is to implement Hash Tables
 * <p/>
 * The runner class creates some hash table objects to run tests on.
 */
public class runner {
    public static void main(String[] args) {
        //ChainedHashTable myTable = new ChainedHashTable;
        ChainedHashTable myTable = new ChainedHashTable(20);
        System.out.println("Here is the empty Chained hash table: " + myTable.printTable());
        myTable.insert(5);
        myTable.insert(19);
        myTable.insert(3);
        myTable.insert(2);
        myTable.insert(1);
        myTable.insert(1);
        myTable.insert(9);
        myTable.insert(8);
        myTable.insert(7);
        myTable.insert(6);
        myTable.insert(5);
        myTable.insert(3);
        myTable.insert(2);
        myTable.insert(1);
        myTable.insert(4);
        myTable.insert(11);
        myTable.insert(14);
        myTable.insert(44);
        myTable.insert(47);
        myTable.insert(99);
        System.out.println("This is the Chained hash table after inserting 20 keys: \n" + myTable.printTable());
        myTable.delete(3);
        myTable.delete(4);
        myTable.delete(99);
        System.out.println("This is the Chained hash table after deleting a few keys: \n" + myTable.printTable());
        System.out.println("The key 5 is at index: " + myTable.search(5));
        System.out.println("The key 19 is at index: " + myTable.search(19));
        System.out.println("The key 1 is at index: " + myTable.search(1));
        System.out.println("The key 47 is at index: " + myTable.search(47));
        System.out.println("The key 14 is at index: " + myTable.search(14));
        System.out.println("The key 33 is at index: " + myTable.search(33));
        System.out.println("The key 99 is at index: " + myTable.search(99));
        System.out.println("The key 100 is at index: " + myTable.search(100));
        System.out.println("The key 13 is at index: " + myTable.search(13));
        System.out.println("The key 12 is at index: " + myTable.search(12));


        openAddressedHashTable myOpenAddressedTable = new openAddressedHashTable(20);
        System.out.println("Here is the empty open address hash table: "
                + myOpenAddressedTable.printTable());
        myOpenAddressedTable.insert(1);
        myOpenAddressedTable.insert(2);
        myOpenAddressedTable.insert(3);
        myOpenAddressedTable.insert(4);
        myOpenAddressedTable.insert(5);
        myOpenAddressedTable.insert(6);
        myOpenAddressedTable.insert(17);
        myOpenAddressedTable.insert(18);
        myOpenAddressedTable.insert(19);
        myOpenAddressedTable.insert(20);
        myOpenAddressedTable.insert(22);
        myOpenAddressedTable.insert(23);
        myOpenAddressedTable.insert(24);
        myOpenAddressedTable.insert(25);
        myOpenAddressedTable.insert(66);
        myOpenAddressedTable.insert(77);
        myOpenAddressedTable.insert(88);
        myOpenAddressedTable.insert(99);
        myOpenAddressedTable.insert(100);
        myOpenAddressedTable.insert(111);
        System.out.println("This is the open addressed hash table after inserting 20 keys: \n"
                + myOpenAddressedTable.printTable());
        myOpenAddressedTable.delete(23);
        myOpenAddressedTable.delete(20);
        myOpenAddressedTable.delete(25);
        System.out.println("This is the open addressed hash table after a few deletions: \n"
                + myOpenAddressedTable.printTable());
        System.out.println("The key 99 is at index: "
                + myOpenAddressedTable.search(99));
        System.out.println("The key 77 is at index: "
                + myOpenAddressedTable.search(77));
        System.out.println("The key 66 is at index: "
                + myOpenAddressedTable.search(66));
        System.out.println("The key 100 is at index: "
                + myOpenAddressedTable.search(100));
        System.out.println("The key 111 is at index: "
                + myOpenAddressedTable.search(111));
        System.out.println("The key 112 is at index: "
                + myOpenAddressedTable.search(112));
        System.out.println("The key 141 is at index: "
                + myOpenAddressedTable.search(141));
        System.out.println("The key 131 is at index: "
                + myOpenAddressedTable.search(131));
        System.out.println("The key 200 is at index: "
                + myOpenAddressedTable.search(200));
        System.out.println("The key 300 is at index: "
                + myOpenAddressedTable.search(300));
    }
}
