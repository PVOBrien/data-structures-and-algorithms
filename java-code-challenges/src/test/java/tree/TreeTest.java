package tree;

import org.junit.Test;
import static org.junit.Assert.*;

// [x] Can successfully instantiate an empty tree
// [x] Can successfully instantiate a tree with a single root node
// [x] Can successfully add a left child and right child to a single root node
// [x] Can successfully return a collection from a preorder traversal
// [x] Can successfully return a collection from an inorder traversal
// [x] Can successfully return a collection from a postorder traversal

public class TreeTest {

    @Test public void testEmptyTreeCreation() {
        Tree treeTest = new Tree();
    }


    @Test public void testTreeCreation() throws Exception {
        Tree treeTest = new Tree();
        treeTest.makeRoot(new Node(42));
        assertNotNull(treeTest); // it's alive!
        assertEquals("should be value 42", 42,treeTest.root.getValue());
        assertNull("this should be null", treeTest.root.getLeft());
        assertNull("this should be null", treeTest.root.getRight());
        assertThrows(Exception.class, () -> treeTest.makeRoot(new Node(12))); // () -> testStack.pop()
    }

    @Test public void testTreeAdds() throws Exception {
        Tree treeTest = new Tree();
        treeTest.makeRoot(new Node(42));
        Node node1 = new Node(21);
        Node node2 = new Node(88);
        Node node3 = new Node(16);
        Node node5 = new Node(3);
        Node node6 = new Node(62);
        treeTest.addLeftNode(treeTest.root, node1);
        treeTest.addLeftNode(node2,node3);
        treeTest.addLeftNode(node1,node5);
        treeTest.addRightNode(treeTest.root, node2);
        treeTest.addRightNode(node2, 45); // to ensure overloaded addRightNode works.
        treeTest.addRightNode(node1,node6);

        assertThrows(Exception.class, () -> treeTest.addLeftNode(treeTest.root, 6));
        assertThrows(Exception.class, () -> treeTest.addRightNode(treeTest.root, node3));
        assertEquals("Root right should be 88", 88, treeTest.root.getRight().getValue());
        assertEquals("Root right should be 21", 21, treeTest.root.getLeft().getValue());
        assertEquals("Root right right should be 45",45,treeTest.root.getRight().getRight().getValue());
        assertEquals("Root left right should be 62",62,treeTest.root.getLeft().getRight().getValue());
    }

    @Test public void testPreOrderWalk() throws Exception {
        Tree treeTest = new Tree();
        treeTest.makeRoot(new Node(42));
        Node node1 = new Node(21);
        Node node2 = new Node(88);
        Node node3 = new Node(16);
        Node node4 = new Node(45);
        Node node5 = new Node(3);
        Node node6 = new Node(62);
        treeTest.addLeftNode(treeTest.root, node1);
        treeTest.addLeftNode(node2,node3);
        treeTest.addLeftNode(node1,node5);
        treeTest.addRightNode(treeTest.root, node2);
        treeTest.addRightNode(node2, node4);
        treeTest.addRightNode(node1,node6);

        assertEquals("This is a prewalk", "[42, 21, 3, 62, 88, 16, 45]", Tree.preOrder(treeTest).toString());
    }

    @Test public void testInOrderWalk() throws Exception {
        Tree treeTest = new Tree();
        treeTest.makeRoot(new Node(42));
        Node node1 = new Node(21);
        Node node2 = new Node(88);
        Node node3 = new Node(16);
        Node node4 = new Node(45);
        Node node5 = new Node(3);
        Node node6 = new Node(62);
        treeTest.addLeftNode(treeTest.root, node1);
        treeTest.addLeftNode(node2,node3);
        treeTest.addLeftNode(node1,node5);
        treeTest.addRightNode(treeTest.root, node2);
        treeTest.addRightNode(node2, node4);
        treeTest.addRightNode(node1,node6);

        assertEquals("This is a prewalk", "[3, 21, 62, 42, 16, 88, 45]", Tree.inOrder(treeTest).toString());
    }

    @Test public void testPostOrderWalk() throws Exception {
        Tree treeTest = new Tree();
        treeTest.makeRoot(new Node(42));
        Node node1 = new Node(21);
        Node node2 = new Node(88);
        Node node3 = new Node(16);
        Node node4 = new Node(45);
        Node node5 = new Node(3);
        Node node6 = new Node(62);
        treeTest.addLeftNode(treeTest.root, node1);
        treeTest.addLeftNode(node2,node3);
        treeTest.addLeftNode(node1,node5);
        treeTest.addRightNode(treeTest.root, node2);
        treeTest.addRightNode(node2, node4);
        treeTest.addRightNode(node1,node6);

        assertEquals("This is a postwalk", "[3, 62, 21, 16, 45, 88, 42]", Tree.postOrder(treeTest).toString());
    }
}
