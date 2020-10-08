package tree;

import java.util.ArrayList;

public class Tree {

// === Tree / Root Setup ===

    public GtreeNode root; // TODO set to private w getters and setters Later

    public Tree() {
        this.root = null;
    } // instantiates empty Tree TODO: Overload constructor to also be able to take in a Node?

    public void makeRoot(GtreeNode newRoot) throws Exception { // makes a root for a newly (empty) instantiated Tree
        if (this.root == null) {
            root = newRoot;
        } else {
            throw new Exception("a root is already here.");
        }
    }

// ^^^ Tree / Root Setup ^^^

// === Left Node Methods ===

    public void addLeftNode(GtreeNode node, int value) throws Exception {
        GtreeNode newNode = new GtreeNode(value);
        if (node.getLeft() == null) {
            node.setLeft(newNode);
        } else {
            throw new Exception("already a value in place to the left.");
        }
    }

    public void addLeftNode(GtreeNode node, GtreeNode newLeftNode) throws Exception { // overloaded to allow for both new nodes, and new values.
        if (node.getLeft() == null) {
            node.setLeft(newLeftNode);
        } else {
            throw new Exception("already a value in place to the left.");
        }
    }

// ^^^ Left Node Methods ^^^

// === Left Node Methods ===

    public void addRightNode(GtreeNode node, int value) throws Exception {
        GtreeNode newNode = new GtreeNode(value);
        if (node != null) {
            node.setRight(newNode);
        } else {
            throw new Exception("already a value in place to the right.");
        }
    }

    public void addRightNode(GtreeNode node, GtreeNode newRightNode) throws Exception {
        if (node.getRight() == null) {
            node.setRight(newRightNode);
        } else {
            throw new Exception("already a value in place to the right.");
        }
    }

// ^^^ Left Node Methods ^^^

// ==== PREORDER WALK =====

    public static ArrayList<Integer> preOrder(Tree tree) {
        ArrayList<Integer> results = new ArrayList<>();
        preOrderWalk(tree.root, results);
        return results;
    }

    private static void preOrderWalk(GtreeNode node, ArrayList<Integer> arrayList) {
        arrayList.add((Integer) node.getValue());
        if (node.getLeft() != null) preOrderWalk(node.getLeft(), arrayList);
        if (node.getRight() != null) preOrderWalk(node.getRight(), arrayList);
    }

// =======================

// ==== INORDER WALK =====


    public static ArrayList<Integer> inOrder(Tree tree) {
        ArrayList<Integer> results = new ArrayList<>();
        inOrderWalk(tree.root, results);
        return results;
    }

    private static void inOrderWalk(GtreeNode node, ArrayList<Integer> arrayList) {
        if (node.getLeft() != null) inOrderWalk(node.getLeft(), arrayList);
        arrayList.add((Integer) node.getValue()); // will need one more pass to get rid of the cast.
        if (node.getRight() != null) inOrderWalk(node.getRight(), arrayList);
    }

// ========================

// ==== POSTORDER WALK ====

    public static ArrayList<Integer> postOrder (Tree tree) {
        ArrayList<Integer> results = new ArrayList<>();
        postOrderWalk(tree.root, results);
        return results;
    }

    private static void postOrderWalk(GtreeNode node, ArrayList<Integer> arrayList) {
        if (node.getLeft() != null) postOrderWalk(node.getLeft(), arrayList);
        if (node.getRight() != null) postOrderWalk(node.getRight(), arrayList);
        arrayList.add((Integer) node.getValue()); // will need one more pass to get rid of the cast.
    }

// ========================

// === Max Value Method ===

    public static int maximumValue(GtreeNode theRoot) {

        if (theRoot == null) {
            return Integer.MIN_VALUE; // why does it go this route to ensure nothing is lower?
        }

        int highestValue = (int) theRoot.getValue();
        int leftHighestValue = maximumValue(theRoot.getLeft());
        int rightHighestValue = maximumValue(theRoot.getRight());

        if (leftHighestValue > highestValue) {
            highestValue = leftHighestValue;
        }
        if (rightHighestValue > highestValue) {
            highestValue = rightHighestValue;
        }

        return highestValue;
    }

    public ArrayList<Integer> breadthFirst() throws Exception {
        QueueOfBinaryNodes queue = new QueueOfBinaryNodes();
        ArrayList<Integer> valueArray = new ArrayList<>();
        GtreeNode currentNode = null;
        queue.enqueue(root);
        if (root != null) {
             do {
                 System.out.println("here's the current node: " + currentNode);
                 currentNode = (GtreeNode) queue.dequeue();
                 if (currentNode != null) {
                     valueArray.add((Integer) currentNode.getValue());
                     if (currentNode.getLeft() != null) queue.enqueue(currentNode.getLeft());
                     if (currentNode.getRight() != null) queue.enqueue(currentNode.getRight());
                 }
             } while (queue.getFront() != null); // why when we just tested if queue was null, it never was, even though nothing was in it?
        } else throw new Exception("There's nothing here!");
        return valueArray;
    }
}