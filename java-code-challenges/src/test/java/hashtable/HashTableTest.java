package hashtable;

import org.junit.Test;
import static org.junit.Assert.*;


public class HashTableTest {

    @Test
    public void htNodeTest (){
        HtNode htNode = new HtNode();
        assertNull("the value should be null", htNode.getKey());
        assertNotNull("The value field exists", htNode.getValue());
        assertEquals("The value is int null, which is 0", 0, htNode.getValue());
    }

    @Test
    public void startingHashTableCreationTest(){
        HashTable hashTable = new HashTable(); // builds it as 0. But I set initialCapacity to 10. ?
        System.out.println(hashTable.theHashTable.size());
        assertEquals("The size should be 10 by default", 10, hashTable.theHashTable.size());
    }
//
    @Test
    public void hashTableCreationTest(){
        HashTable hashTable = new HashTable(5); // this doesn't do anything. So... what is "initial capacity
        System.out.println(hashTable.theHashTable.size());
        assertEquals("The size should be 5", 5, hashTable.theHashTable.size());
    }

    @Test
    public void hashTableAddTest(){
        HashTable hashTable = new HashTable(15); // this doesn't do anything. So... what is "initial capacity
        hashTable.add("five", 5);
        hashTable.add("seven", 7);
        hashTable.add("four", 4);
        hashTable.add("Pawn", 1);
        hashTable.add("Rook", 2);
        hashTable.add("queen", 6);
        hashTable.add("king", 7);
        System.out.println(hashTable.toString(hashTable));
        assertEquals("The size should be 15", 15, hashTable.theHashTable.size());
    }

}
