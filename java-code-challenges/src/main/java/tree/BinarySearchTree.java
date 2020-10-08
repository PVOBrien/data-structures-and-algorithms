package tree;

import stacksandqueues.Queue;
import stacksandqueues.QueueGeneric;

import java.util.ArrayList;

public class BinarySearchTree extends Tree {

    public void add(int value, Tree theTree) throws Exception { // can be refactored in order not to take in theTree
        GtreeNode newBNode = new GtreeNode(value);
        GtreeNode toCheck = theTree.root;

        if (toCheck != null) {
            if ((int) newBNode.getValue() <= (int) toCheck.getValue()) helperAddLeft(newBNode, toCheck);
            if ((int) newBNode.getValue() > (int) toCheck.getValue()) helperAddRight(newBNode, toCheck);
        }
    }

    private void helperAddLeft(GtreeNode nodeToAdd, GtreeNode nodeToCheck) throws Exception {
        if (nodeToAdd.getValue() == nodeToCheck.getValue()) {
            throw new Exception("This value already exists within the tree.");
        }
        if (nodeToCheck.getLeft() == null) { // this is base case
            nodeToCheck.setLeft(nodeToAdd); // this is what happens at "the end".
        } else {
            if ((int) nodeToAdd.getValue() > (int) nodeToCheck.getLeft().getValue()) {
                nodeToAdd.setLeft(nodeToCheck.getLeft());
                nodeToCheck.setLeft(nodeToAdd);
                return;
            }
            helperAddLeft(nodeToAdd, nodeToCheck.getLeft());
        }
    }

    private void helperAddRight(GtreeNode nodeToAdd, GtreeNode nodeToCheck) throws Exception {
        if (nodeToAdd.getValue() == nodeToCheck.getValue()) {
            throw new Exception("This value already exists within the tree.");
        }
        if (nodeToCheck.getRight() == null) {
            nodeToCheck.setRight(nodeToAdd);
        } else {
            if ((int) nodeToAdd.getValue() < (int) nodeToCheck.getRight().getValue()) {
                nodeToAdd.setRight(nodeToCheck.getRight());
                nodeToCheck.setRight(nodeToAdd);
            }
            helperAddRight(nodeToAdd, nodeToCheck.getRight());
        }
    }

    public boolean contains(int value, GtreeNode nodeToCheck) { // https://www.baeldung.com/java-binary-tree ftw. See below comment for my hangup. TODO refactor in order not to explicitly call the node.
        if (nodeToCheck == null) return false;
        if (value == (int) nodeToCheck.getValue()) return true; // I had this code prior to me checking the web. Keep going for the real q...

        return value < (int) nodeToCheck.getValue()               // why does this work? It's not returning boolean true/false, but it's not getting angry w it. ?
                ? contains(value, nodeToCheck.getLeft())
                : contains(value, nodeToCheck.getRight()); // Because I had this rearranged a couple of ways, and my return true always "bubbled back up" to a code block that the value *couldn't even satisfy* but the code ran it anyway. ???
    } // also, why does this ternary work here? Tried to get this working elsewhere in the project, and it kept ! me in either of the three ways I tried to frame it up just so.

}
