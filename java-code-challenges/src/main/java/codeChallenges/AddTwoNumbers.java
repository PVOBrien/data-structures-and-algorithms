package codeChallenges;

import java.util.Objects;

public class AddTwoNumbers {

    static class ListNode { // This is basically a LinkedList. At least a node for it. The linkedList just sort of happens.
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" + "val=" + val + ", next=" + next + '}';
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null ) { throw new NullPointerException("Nothing to print."); } // if someone tries to grief the method.

        ListNode current;
        int remainder = 0;

        if (Objects.requireNonNull(l1).val + Objects.requireNonNull(l2).val > 9) { remainder = 1; } // the "throw new NPE" up above should catch if it's null, but the Objects.requireNN... seems to be a doublesafe.
//        if (l1.val + l2.val > 9) { remainder = 1; } // this is the simpler / less safe way of writing the above line.

        ListNode head = new ListNode((l1.val + l2.val) % 10); // gotta start somewhere...
        l1 = l1.next; // move it forward
        l2 = l2.next; // move it forward
        current = head; // now start tracking, pass by reference

        while (l1 != null || l2 != null) { // base case: if there's something to look at.

            ListNode tempNode = new ListNode(); // create /  hold the new node

            int valOne = l1 != null ? l1.val : 0;
            int valTwo = l2 != null ? l2.val : 0;

            int value = (valOne + valTwo + remainder) % 10; // node's value. checked see if it would be double digit. 0 is a valid number
            remainder = valOne + valTwo + remainder > 9 ? 1 : 0; // check to see if there is an additional remainder carried on.

            tempNode.val = value;

            current.next = tempNode;
            current = current.next;

            l1 = l1 != null ? l1.next : null; // move it forward
            l2 = l2 != null ? l2.next : null; // move it forward
        }

        if (remainder == 1) { current.next = new ListNode(1); }
        return head; // thank goodness, the pass by reference works, and was building from head
    }

    public static String prettyPrint(ListNode listNode) throws NullPointerException {

        if (listNode == null) { throw new NullPointerException("Nothing to print."); }
        StringBuilder lnPrint = new StringBuilder("ListNode:");

        while (listNode != null) {
            lnPrint.append(" ").append(listNode.val); // :eyeBrowRaise: this method chaining is more acceptable than concatenation?
            listNode = listNode.next;
        }
        return lnPrint.toString();
    }
}
