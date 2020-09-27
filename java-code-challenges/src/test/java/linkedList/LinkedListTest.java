package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {


  @Test public void testEmptyLinkList() {
    assertNotNull(new LinkedList());
  }

  @Test public void testInsert() {
    LinkedList tryList = new LinkedList();
    tryList.insert(4);
    assertEquals("Here's the first linkedlist entry.", 4,tryList.head.value);
  }

  @Test public void testIncludes() {
    LinkedList tryList = new LinkedList();
    tryList.insert(4);
    tryList.insert(3);
    tryList.insert(2);
    tryList.insert(1);
    assertTrue(tryList.includes(3));
    assertFalse(tryList.includes(8));
  }

  @Test public void testToString() {
    LinkedList tryList = new LinkedList();
    tryList.insert(4);
    tryList.insert(3);
    tryList.insert(2);
    tryList.insert(1);
    assertEquals("this is what it should read out like.", "1 -> 2 -> 3 -> 4 -> Null", tryList.toTheString());
  }

  @Test public void testAppend(){
    LinkedList tryList = new LinkedList();
    tryList.append(5);
    tryList.insert(4);
    tryList.insert(3);
    tryList.insert(2);
    tryList.insert(1);
    tryList.append(6);
    assertEquals("this is what it should read out like.", "1 -> 2 -> 3 -> 4 -> 5 -> 6 -> Null", tryList.toTheString());
  }

  @Test public void testInsertBefore() throws Exception {
    LinkedList tryList = new LinkedList();
    tryList.insert(4);
    tryList.insert(3);
    tryList.insert(2);
    tryList.insert(1);
    tryList.insertBefore(2,5);
    assertEquals("this is what it should read out like.", "1 -> 5 -> 2 -> 3 -> 4 -> Null", tryList.toTheString());
  }

  @Test public void testInsertAfter() throws Exception {
    LinkedList tryList = new LinkedList();
    tryList.insert(4);
    tryList.insert(3);
    tryList.insert(2);
    tryList.insert(1);
    tryList.insertAfter(4,8);
    assertEquals("this is what it should read out like.", "1 -> 2 -> 3 -> 4 -> 8 -> Null", tryList.toTheString());
  }

  @Test public void kthSameSize() throws Exception {
    LinkedList tryList = new LinkedList();
    tryList.insert(2);
    tryList.insert(8);
    tryList.insert(3);
    tryList.insert(1);
    assertEquals("This should be from the \"index\" of the linkedlist", 1, tryList.valueFromKthLazy(3));
  }

  @Test public void kthGreaterSize() throws Exception {
    LinkedList tryList = new LinkedList();
    tryList.insert(2);
    tryList.insert(8);
    tryList.insert(3);
    tryList.insert(1);
    assertEquals("This should be from the \"index\" of the linkedlist", 1, tryList.valueFromKthLazy(5));
  }

  @Test public void kthSameAndSizeOne() throws Exception {
    LinkedList tryList = new LinkedList();
    tryList.insert(2);
    assertThrows("This should throw", Exception.class, () -> tryList.valueFromKthLazy(1));
  }

  @Test public void kthNegative() throws Exception {
    LinkedList tryList = new LinkedList();
    tryList.insert(2);
    tryList.insert(8);
    tryList.insert(3);
    tryList.insert(1);
    assertThrows("This should throw", Exception.class, () -> tryList.valueFromKthLazy(-1));
  }

  @Test public void testNodesArray2() throws Exception {

    LinkedList tryList = new LinkedList();
    tryList.insert(2);
    assertEquals("This should be from the \"index\" of the linkedlist", 2, tryList.valueFromKthLazy(0));
//    assertThrows("This should throw",
//      kthNegative().class,
//      () -> tryList.valueFromKth(5)
//    ) // arrow functions are LAMBDA, NOT ARROW FUNCTIONS
  }

  @Test public void kthHappy() throws Exception {
    LinkedList tryList = new LinkedList();
    tryList.insert(2);
    tryList.insert(8);
    tryList.insert(3);
    tryList.insert(1);
    assertEquals("This should be from the \"index\" of the linkedlist", 3, tryList.valueFromKthLazy(2));
  }


  @Test
  public void testZip() {
    LinkedList linkedList = new LinkedList();
    LinkedList linkedList2 = new LinkedList ();
    linkedList.insert(1);
    linkedList.insert(3);
    linkedList.insert(5);
    linkedList.insert(7);
    linkedList2.insert(2);
    linkedList2.insert(4);
    linkedList2.insert(6);
    linkedList2.insert(8);
    linkedList.zip(linkedList, linkedList2);
    assertEquals("Should return {7} -> {{8} -> {{5} -> {{6} -> {{3} -> {{4} -> {{1} -> {{2} -> {null}}}}}}}}", "7 -> 8 -> 5 -> 6 -> 3 -> 4 -> 1 -> 2 -> Null", linkedList.toTheString());
  }
  @Test
  public void testZip2() {
    LinkedList linkedList = new LinkedList();
    LinkedList linkedList2 = new LinkedList ();
    linkedList.insert(1);
    linkedList.insert(3);
    linkedList.insert(5);
    linkedList.insert(7);
    linkedList2.insert(2);
    linkedList2.insert(4);
    linkedList.zip(linkedList, linkedList2);
    assertEquals("Should return {7} -> {{4} -> {{5} -> {{2} -> {{3} -> {{1} -> {null}}}}}}", "7 -> 4 -> 5 -> 2 -> 3 -> 1 -> Null", linkedList.toTheString());
  }
  @Test
  public void testZip3() {
    LinkedList linkedList = new LinkedList();
    LinkedList linkedList2 = new LinkedList ();
    linkedList.insert(5);
    linkedList.insert(7);
    linkedList2.insert(2);
    linkedList2.insert(4);
    linkedList2.insert(6);
    linkedList2.insert(8);
    linkedList.zip(linkedList, linkedList2);
    assertEquals("Should return {7} -> {{8} -> {{5} -> {{6} -> {{3} -> {{4} -> {{1} -> {{2} -> {null}}}}}}}}", "7 -> 8 -> 5 -> 6 -> 4 -> 2 -> Null", linkedList.toTheString());
  }
}