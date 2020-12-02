package codeChallenges;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Sum two numbers in parallel lists")
public class AddTwoNumbersTest {

    AddTwoNumbers.ListNode tln1 = new AddTwoNumbers.ListNode();
    AddTwoNumbers.ListNode tln2 = new AddTwoNumbers.ListNode();

    @BeforeAll
    @DisplayName("Setup the ListNodes")
    public void ListNodes(){
        Assertions.assertNotNull(tln1);
        tln1.val = 5;
        tln2.val = 7;
        AddTwoNumbers.ListNode tln3 = new AddTwoNumbers.ListNode();
        tln3.val = 3;
        AddTwoNumbers.ListNode tln4 = new AddTwoNumbers.ListNode();
        tln4.val = 4;
        AddTwoNumbers.ListNode tln5 = new AddTwoNumbers.ListNode();
        tln5.val = 5;
        AddTwoNumbers.ListNode tln6 = new AddTwoNumbers.ListNode();
        tln6.val = 6;
        tln1.next = tln3;
        tln2.next = tln4;
        tln3.next = tln5;
        tln4.next = tln6;
    }

    @Test
    @DisplayName("Summing NodeLists")
    public void sumNodeListTest(){
        AddTwoNumbers.ListNode aSumList = AddTwoNumbers.addTwoNumbers(tln1, tln2);
        Assertions.assertEquals("ListNode{val=1, next=ListNode{val=2, next=ListNode{val=8, next=ListNode{val=1, next=null}}}}", aSumList.toString());
        String prettyPrintResults = AddTwoNumbers.prettyPrint(aSumList);
    }

    @Test
    public void valueTest(){
    }
}
