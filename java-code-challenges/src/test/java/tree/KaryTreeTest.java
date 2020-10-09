package tree;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class KaryTreeTest {

    KaryTree<String> karyTree = new KaryTree<>(); // anything you want "globally" available, still needs to be outside of everywhere.

    @Before
    public void newTestKaryTree(){
        karyTree.insert("1");
        karyTree.insert("2");
        karyTree.insert("3");
        karyTree.insert("4");
        karyTree.insert("5");
        karyTree.insert("6");
        karyTree.insert("7");
        karyTree.insert("8");
        karyTree.insert("9");
        karyTree.insert("10");
        karyTree.insert("11");
        karyTree.insert("12");
        karyTree.insert("13");
        karyTree.insert("14");
        karyTree.insert("15");
        System.out.println("This too is running" + karyTree);
    }

    @Before
    public void soutTest(){
        System.out.println("THIS IS RUNING @BEFORE");
    }

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
        System.out.println(karyTree);
        assertEquals("A tree built", "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15", karyTree.toString());
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
        assertEquals("A tree built", "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", karyTree.toString());
    }
}
