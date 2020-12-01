package linkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

  @Test
  public void testEmptyLinkList() {
    assertNotNull(new LinkedList());
  }

  @Test public void testInsert() {
    LinkedList tryList = new LinkedList();
    tryList.insert(4);
    assertEquals(4,tryList.head.value);
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
    assertEquals(1, tryList.valueFromKthLazy(3));
    assertThrows(Exception.class, () -> tryList.valueFromKthLazy(4));
  }

  @Test public void kthGreaterSize(){
    LinkedList tryList = new LinkedList();
    tryList.insert(2);
    tryList.insert(8);
    tryList.insert(3);
    tryList.insert(1);
    assertThrows(Exception.class, () -> tryList.valueFromKthLazy(4));
  }

  @Test public void kthSameAndSizeOne(){
    LinkedList tryList = new LinkedList();
    tryList.insert(2);
    assertThrows(Exception.class, () -> tryList.valueFromKthLazy(1));
  }

  @Test public void kthNegative() throws Exception { // left this in place... why doesn't it throw? It's literally down there below, Exception.class. ?
    LinkedList tryList = new LinkedList();
    tryList.insert(2);
    tryList.insert(8);
    tryList.insert(3);
    tryList.insert(1);
    assertThrows(Exception.class, () -> tryList.valueFromKthLazy(-1));
    tryList.valueFromKthLazy(-1);
  }

  @Test public void testNodesArray2(){
    LinkedList tryList = new LinkedList();
    tryList.insert(2);
    assertThrows(Exception.class, () -> tryList.valueFromKthLazy(0));
  }

  @Test public void kthHappy() throws Exception {
    LinkedList tryList = new LinkedList();
    tryList.insert(2);
    tryList.insert(8);
    tryList.insert(3);
    tryList.insert(1);
    assertEquals(3, tryList.valueFromKthLazy(2));
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