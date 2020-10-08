package tree;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testEmptyBT(){
        BinarySearchTree binaryTree = new BinarySearchTree();
        assertNotNull(binaryTree);
    }

    @Test
    public void addRootBstTest() throws Exception {
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.makeRoot(new GtreeNode(50));
        assertEquals("This should be 50.", 50,binaryTree.root.getValue());
        assertThrows(Exception.class, () -> binaryTree.add(50, binaryTree));
    }

    @Test
    public void binarySearchTreeAddTest() throws Exception{
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.makeRoot(new GtreeNode(50));
        binaryTree.add(25, binaryTree);
        binaryTree.add(35, binaryTree);
        binaryTree.add(45, binaryTree);
        binaryTree.add(65, binaryTree);
        binaryTree.add(75, binaryTree);
        assertEquals("In order, up the numbers should go.", "[25, 35, 45, 50, 65, 75]", Tree.inOrder(binaryTree).toString());
    }

    @Test
    public void binarySearchTreeContainsTest() throws Exception{
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.makeRoot(new GtreeNode(50));
        binaryTree.add(25, binaryTree);
        binaryTree.add(35, binaryTree);
        binaryTree.add(45, binaryTree);
        binaryTree.add(65, binaryTree);
        binaryTree.add(75, binaryTree);
        assertTrue(binaryTree.contains(65, binaryTree.root));
        assertTrue(binaryTree.contains(35, binaryTree.root));
        assertFalse(binaryTree.contains(33, binaryTree.root));
    }

}