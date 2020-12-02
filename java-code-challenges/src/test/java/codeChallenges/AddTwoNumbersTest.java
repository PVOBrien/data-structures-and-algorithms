package codeChallenges;

import org.apache.commons.math3.analysis.function.Add;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Sum two numbers in parallel lists")
public class AddTwoNumbersTest {

    AddTwoNumbers.ListNode tln1 = new AddTwoNumbers.ListNode();
    AddTwoNumbers.ListNode tln2 = new AddTwoNumbers.ListNode();
    AddTwoNumbers.ListNode tlnX1 = new AddTwoNumbers.ListNode(9);
    AddTwoNumbers.ListNode tlnX8 = new AddTwoNumbers.ListNode(9);

    @BeforeAll
    @DisplayName("Setup the ListNodes")
    void ListNodes1(){
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

        AddTwoNumbers.ListNode tlnX2 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode tlnX3 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode tlnX4 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode tlnX5 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode tlnX6 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode tlnX7 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode tlnX9 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode tlnX10 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode tlnX11 = new AddTwoNumbers.ListNode(9);
        tlnX1.next = tlnX2;
        tlnX2.next = tlnX3;
        tlnX3.next = tlnX4;
        tlnX4.next = tlnX5;
        tlnX5.next = tlnX6;
        tlnX6.next = tlnX7;
        tlnX8.next = tlnX9;
        tlnX9.next = tlnX10;
        tlnX10.next = tlnX11;
    }

    @Test
    @DisplayName("Summing NodeLists")
    void sumNodeListTest(){
        System.out.println(AddTwoNumbers.prettyPrint(tln1));
        System.out.println(AddTwoNumbers.prettyPrint(tln2));
        AddTwoNumbers.ListNode aSumList = AddTwoNumbers.addTwoNumbers(tln1, tln2);
        System.out.println(AddTwoNumbers.prettyPrint(aSumList));
        Assertions.assertEquals("ListNode{val=2, next=ListNode{val=8, next=ListNode{val=1, next=ListNode{val=1, next=null}}}}", aSumList.toString());
    }

    @Test
    @DisplayName("NPE check for prettyPrint method")
    public void valueTest() throws NullPointerException {
        AddTwoNumbers.ListNode listNode = null;
        //noinspection ConstantConditions
        Assertions.assertThrows(NullPointerException.class, () -> AddTwoNumbers.prettyPrint(listNode));
    }

    @Test
    @DisplayName("Pretty printing a nodeList")
    void prettyPrintNodeListTest(){
        AddTwoNumbers.ListNode aSumList = AddTwoNumbers.addTwoNumbers(tln1, tln2);
        String prettyPrintResults = AddTwoNumbers.prettyPrint(aSumList);
        Assertions.assertEquals("ListNode: 2 8 1 1", prettyPrintResults);
    }

    @Test
    @DisplayName("Summing NodeLists")
    void trickySumNodeListTest(){
        AddTwoNumbers.ListNode aTrickySum = AddTwoNumbers.addTwoNumbers(tlnX1, tlnX8);
        System.out.println(AddTwoNumbers.prettyPrint(aTrickySum));
    }

}
