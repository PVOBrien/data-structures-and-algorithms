package tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class KaryTreeTest {

    @Test
    public void testKaryTree(){
        KaryTree<String> tree = new KaryTree<>();
        tree.insert("1");
        tree.insert("2");
        tree.insert("3");
        tree.insert("4");
        tree.insert("5");
        tree.insert("6");
        tree.insert("7");
        tree.insert("8");
        tree.insert("9");
        tree.insert("10");
        tree.insert("11");
        tree.insert("12");
        tree.insert("13");
        tree.insert("14");
        tree.insert("15");
        System.out.println(tree.toString());
        assertEquals("A tree built", "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15", tree.toString());
    }

    @Test
    public void testFizzBuzz(){
        KaryTree<String> tree = new KaryTree<>();
        tree.insert("1");
        tree.insert("2");
        tree.insert("3");
        tree.insert("4");
        tree.insert("5");
        tree.insert("6");
        tree.insert("7");
        tree.insert("8");
        tree.insert("9");
        tree.insert("10");
        tree.insert("11");
        tree.insert("12");
        tree.insert("13");
        tree.insert("14");
        tree.insert("15");
        KaryTree<String> totest = tree.fizzBuzz();
        assertEquals("A tree built", "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", totest.toString());
    }
}
