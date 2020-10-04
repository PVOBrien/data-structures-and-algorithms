package tree;

import java.util.ArrayList;

public class Tree {

// === Tree / Root Setup ===

    public Node root; // TODO set to private w getters and setters Later

    public Tree() {
        this.root = null;
    } // instantiates empty Tree

    public void makeRoot(Node newRoot) throws Exception { // makes a root for a newly (empty) instantiated Tree
        if (this.root == null) {
            root = newRoot;
        } else {
            throw new Exception("a root is already here.");
        }
    }

// ^^^ Tree / Root Setup ^^^

// === Left Node Methods ===

    public void addLeftNode(Node node, int value) throws Exception {
        Node newNode = new Node(value);
        if (node.getLeft() == null) {
            node.setLeft(newNode);
        } else {
            throw new Exception("already a value in place to the left.");
        }
    }

    public void addLeftNode(Node node, Node newLeftNode) throws Exception { // overloaded to allow for both new nodes, and new values.
        if (node.getLeft() == null) {
            node.setLeft(newLeftNode);
        } else {
            throw new Exception("already a value in place to the left.");
        }
    }

// ^^^ Left Node Methods ^^^

// === Left Node Methods ===

    public void addRightNode(Node node, int value) throws Exception {
        Node newNode = new Node(value);
        if (node != null) {
            node.setRight(newNode);
        } else {
            throw new Exception("already a value in place to the right.");
        }
    }

    public void addRightNode(Node node, Node newRightNode) throws Exception {
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

    private static void preOrderWalk(Node node, ArrayList<Integer> arrayList) {
        arrayList.add(node.getValue());
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

    private static void inOrderWalk(Node node, ArrayList<Integer> arrayList) {
        if (node.getLeft() != null) inOrderWalk(node.getLeft(), arrayList);
        arrayList.add(node.getValue());
        if (node.getRight() != null) inOrderWalk(node.getRight(), arrayList);
    }

// ========================

// ==== POSTORDER WALK ====

    public static ArrayList<Integer> postOrder (Tree tree) {
        ArrayList<Integer> results = new ArrayList<>();
        postOrderWalk(tree.root, results);
        return results;
    }

    private static void postOrderWalk(Node node, ArrayList<Integer> arrayList) {
        if (node.getLeft() != null) postOrderWalk(node.getLeft(), arrayList);
        if (node.getRight() != null) postOrderWalk(node.getRight(), arrayList);
        arrayList.add(node.getValue());
    }

// ========================

}