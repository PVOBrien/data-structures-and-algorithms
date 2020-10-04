package tree;


import org.junit.Test;

import static org.junit.Assert.assertNull;

public class BinaryTreeTest {

    @Test
    public void testEmptyBT(){
        BinaryTree binaryTree = new BinaryTree();
        assertNull(binaryTree);
    }

}
