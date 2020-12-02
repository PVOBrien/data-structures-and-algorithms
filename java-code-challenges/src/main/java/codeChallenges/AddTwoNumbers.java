package codeChallenges;

public class AddTwoNumbers {

    static class ListNode {
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

        ListNode head = null;
        ListNode current = new ListNode();

        while (l1 != null) { // base case: if there's something to look at.

            if (head == null && l1.val + l2.val > 9) { // edge case: what if the first #s add to 10 or more?
                head = new ListNode(1); // if so, then put that overflow to a 1
                current = head; // and then pass it by reference. (right?)
            } else if (head == null) { // this is the easy/happy path to get it going
                head = new ListNode(l1.val + l2.val); // gotta start somewhere...
                l1 = l1.next; // move it forward
                l2 = l2.next; // move it forward
                current = head; // pass it by reference
            }

            ListNode tempNode = new ListNode(); // create / hold the new node
            tempNode.val = (l1.val + l2.val) % 10; // node's value. checked see if it would be double digit. 0 is a valid number
            if (l1.next != null && l1.next.val + l2.next.val > 9) { // edge case check
                tempNode.val++; // edge case result
            }

            current.next = tempNode; // add that tempnode!
            current = current.next; // move it forward

            l1 = l1.next; // move it forward
            l2 = l2.next; // move it forward
        }
        return head; // thank goodness, the pass by reference works, and was building from head
    }

    public static String prettyPrint(ListNode listNode) {
        if (listNode == null) { throw new NullPointerException("Nothing to print."); }

        StringBuilder lnPrint = new StringBuilder("Pretty print a listnode: ");

        while (listNode != null) {
            lnPrint.append(listNode.val + " ");
            listNode = listNode.next;
        }
//        System.out.println("prettyPrint result: " + lnPrint);
        return lnPrint.toString();
    }

}
