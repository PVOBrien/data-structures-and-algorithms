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
        HashTable hashTable = new HashTable();
        System.out.println(hashTable.theHashTable.size());
//        assertEquals("The size should be 10 by default", 10, hashTable.theHashTable.size());
    }
//
    @Test
    public void hashTableCreationTest(){
        HashTable hashTable = new HashTable(5);
        System.out.println(hashTable.theHashTable.size());
//        assertEquals("The size should be 5", 5, hashTable.theHashTable.size());
    }
}
