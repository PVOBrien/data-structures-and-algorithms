package hashtable;

import org.junit.Test;

import java.util.NoSuchElementException;

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
    public void hashTableFunctionsTest(){
        HashTable hashTable = new HashTable(15); // this doesn't do anything. So... what is "initial capacity
        hashTable.add("five", 5);
        hashTable.add("seven", 7);
        hashTable.add("four", 4);
        hashTable.add("Pawn", 1);
        hashTable.add("Rook", 2);
        hashTable.add("queen", 6);
        hashTable.add("king", 7);
        assertEquals("The size should be 15", 15, hashTable.theHashTable.size());
        assertEquals("It should look like so: ", "[\n" +
                "0: [{Rook, 2},] \n" +
                "1: [] \n" +
                "2: [] \n" +
                "3: [{four, 4},] \n" +
                "4: [{queen, 6},] \n" +
                "5: [] \n" +
                "6: [{seven, 7},] \n" +
                "7: [] \n" +
                "8: [] \n" +
                "9: [] \n" +
                "10: [{five, 5},] \n" +
                "11: [{king, 7},] \n" +
                "12: [] \n" +
                "13: [] \n" +
                "14: [{Pawn, 1},] \n" +
                "]", hashTable.toString(hashTable));
        assertTrue("A king doth exist.", hashTable.contains("king"));
        assertFalse("No bishop is present", hashTable.contains("Bishop"));
        assertEquals("here is a 4, from four.", 4, hashTable.retrieve("four"));
        assertThrows(NoSuchElementException.class, () -> hashTable.retrieve("Bishop"));
    }
}
