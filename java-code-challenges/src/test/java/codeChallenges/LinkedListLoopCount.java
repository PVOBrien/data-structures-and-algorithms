package codeChallenges;

import stacksandqueues.Node;

import java.util.HashMap;

public class LinkedListLoopCount {

    public static int loopSize(Node<Integer> node) {
        if (node.getValue() == null) return -1;

        StringBuilder nodeStringBuilder = new StringBuilder();
        String nodeStringToCheck = nodeStringBuilder.toString();

        HashMap<Node, Integer> nodeHash = new HashMap<>(); // that key / Node is the unique memory location. Hence it is completely UNIQUE.

        Boolean match = false;
//        int nodeValue;
        int counter = 0; // off by one?
        Node nodeToCheck = node;

        while (nodeToCheck.getValue() == null) {

            if (nodeHash.containsKey(nodeToCheck)) {
                return nodeHash.get(nodeToCheck) - counter;
            }
            nodeStringBuilder.append(nodeToCheck.getValue());
            nodeHash.put(nodeToCheck, counter);
            counter++;
            nodeToCheck = nodeToCheck.getBackOrBottom();
        }
        return nodeStringToCheck.length();
    }
}

//    public int loopSize(Node node) {

// === how to find a loop w fast slow pointers below ===
//        Node a = node;
//        Node b = node.getNext();
//
//        while (a != b)
//        {
//            a = a.getNext();
//            b = b.getNext().getNext();
//        }
// ^^^ how to find a loop w fast slow pointers. ^^^
//        int len = 0;
//
//        do {
//            b = b.getNext();
//            len++;
//        } while (a != b);
//
//        return len;
//    }
//}