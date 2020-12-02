package tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

// [x] Can successfully instantiate an empty tree
// [x] Can successfully instantiate a tree with a single root node
// [x] Can successfully add a left child and right child to a single root node
// [x] Can successfully return a collection from a preorder traversal
// [x] Can successfully return a collection from an inorder traversal
// [x] Can successfully return a collection from a postorder traversal

public class TreeTest {

    @Test
    public void testEmptyTreeCreation() {
        Tree treeTest = new Tree();
//        TODO TEST HERE.
    }


    @Test public void testTreeCreation() throws Exception {
        Tree treeTest = new Tree();
        treeTest.makeRoot(new GtreeNode(42));
        assertNotNull(treeTest); // it's alive!
        assertEquals(42,treeTest.root.getValue());
        assertNull(treeTest.root.getLeft());
        assertNull(treeTest.root.getRight());
        assertThrows(Exception.class, () -> treeTest.makeRoot(new GtreeNode(12))); // () -> testStack.pop()
    }

    @Test public void testTreeAdds() throws Exception {
        Tree treeTest = new Tree();
        treeTest.makeRoot(new GtreeNode(42));
        GtreeNode node1 = new GtreeNode(21);
        GtreeNode node2 = new GtreeNode(88);
        GtreeNode node3 = new GtreeNode(16);
        GtreeNode node5 = new GtreeNode(3);
        GtreeNode node6 = new GtreeNode(62);
        treeTest.addLeftNode(treeTest.root, node1);
        treeTest.addLeftNode(node2,node3);
        treeTest.addLeftNode(node1,node5);
        treeTest.addRightNode(treeTest.root, node2);
        treeTest.addRightNode(node2, 45); // to ensure overloaded addRightNode works.
        treeTest.addRightNode(node1,node6);

        assertThrows(Exception.class, () -> treeTest.addLeftNode(treeTest.root, 6));
        assertThrows(Exception.class, () -> treeTest.addRightNode(treeTest.root, node3));
        assertEquals(88, treeTest.root.getRight().getValue());
        assertEquals( 21, treeTest.root.getLeft().getValue());
        assertEquals(45,treeTest.root.getRight().getRight().getValue());
        assertEquals(62,treeTest.root.getLeft().getRight().getValue());
    }

    @Test public void testPreOrderWalk() throws Exception {
        Tree treeTest = new Tree();
        treeTest.makeRoot(new GtreeNode(42));
        GtreeNode node1 = new GtreeNode(21);
        GtreeNode node2 = new GtreeNode(88);
        GtreeNode node3 = new GtreeNode(16);
        GtreeNode node4 = new GtreeNode(45);
        GtreeNode node5 = new GtreeNode(3);
        GtreeNode node6 = new GtreeNode(62);
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
        treeTest.makeRoot(new GtreeNode(42));
        GtreeNode node1 = new GtreeNode(21);
        GtreeNode node2 = new GtreeNode(88);
        GtreeNode node3 = new GtreeNode(16);
        GtreeNode node4 = new GtreeNode(45);
        GtreeNode node5 = new GtreeNode(3);
        GtreeNode node6 = new GtreeNode(62);
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
        treeTest.makeRoot(new GtreeNode(42));
        GtreeNode node1 = new GtreeNode(21);
        GtreeNode node2 = new GtreeNode(88);
        GtreeNode node3 = new GtreeNode(16);
        GtreeNode node4 = new GtreeNode(45);
        GtreeNode node5 = new GtreeNode(3);
        GtreeNode node6 = new GtreeNode(62);
        treeTest.addLeftNode(treeTest.root, node1);
        treeTest.addLeftNode(node2,node3);
        treeTest.addLeftNode(node1,node5);
        treeTest.addRightNode(treeTest.root, node2);
        treeTest.addRightNode(node2, node4);
        treeTest.addRightNode(node1,node6);

        assertEquals("This is a postwalk", "[3, 62, 21, 16, 45, 88, 42]", Tree.postOrder(treeTest).toString());
    }

    @Test public void testMaximumValue() throws Exception {
        Tree treeTest = new Tree();
        treeTest.makeRoot(new GtreeNode(42));
        GtreeNode node1 = new GtreeNode(21);
        GtreeNode node2 = new GtreeNode(88);
        GtreeNode node3 = new GtreeNode(16);
        GtreeNode node4 = new GtreeNode(45);
        GtreeNode node5 = new GtreeNode(3);
        GtreeNode node6 = new GtreeNode(62);
        treeTest.addLeftNode(treeTest.root, node1);
        treeTest.addLeftNode(node2,node3);
        treeTest.addLeftNode(node1,node5);
        treeTest.addRightNode(treeTest.root, node2);
        treeTest.addRightNode(node2, node4);
        treeTest.addRightNode(node1,node6);
        assertEquals(88, Tree.maximumValue(treeTest.root)); // TODO Ensure the highest value is being returned.
        GtreeNode nodeX = new GtreeNode(156);
        treeTest.addLeftNode(node6, nodeX);
        assertEquals(156, Tree.maximumValue(treeTest.root)); // TODO Ensure the highest value is being returned.
//        assertEquals("These equal the string values", "[42, 21, 3, 62, 88, 16, 45]", treeTest.maximumValue(treeTest.root)); // TODO Make sure all nodes are being checked.
        // assertThrows(Exception);// TODO Make sure there are nodes (w values).
    }

    @Test public void testBreadthFirst() throws Exception {
        Tree treeTest = new Tree();
        treeTest.makeRoot(new GtreeNode(42));
        GtreeNode node1 = new GtreeNode(21);
        GtreeNode node2 = new GtreeNode(88);
        GtreeNode node3 = new GtreeNode(16);
        GtreeNode node4 = new GtreeNode(45);
        GtreeNode node5 = new GtreeNode(3);
        GtreeNode node6 = new GtreeNode(62);
        treeTest.addLeftNode(treeTest.root, node1);
        treeTest.addLeftNode(node2,node3);
        treeTest.addLeftNode(node1,node5);
        treeTest.addRightNode(treeTest.root, node2);
        treeTest.addRightNode(node2, node4);
        treeTest.addRightNode(node1,node6);
        System.out.println(Tree.preOrder(treeTest));
        ArrayList<Integer> toTest = treeTest.breadthFirst();
        assertEquals("This should be...", "[42, 21, 88, 3, 62, 16, 45]", toTest.toString());
    }
}
