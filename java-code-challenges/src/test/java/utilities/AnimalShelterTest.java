package utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void testEmptyAnimalShelter() {
        NodeGenericQueue quietShelter = new NodeGenericQueue();
        System.out.println(quietShelter.toString());
    }

    @Test
    public void testFillingAnimalShelter() {
        NodeGenericQueue quietShelter = new NodeGenericQueue();
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");

        assertEquals("catdogcatdog", "cat -> dog -> cat -> dog -> Back", quietShelter.toString());
    }

    @Test
    public void testGivingCats() {
        NodeGenericQueue quietShelter = new NodeGenericQueue();
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");
        assertEquals("catdogcatdog", "cat -> dog -> cat -> dog -> Back", quietShelter.toString());

        quietShelter.dequeue("cat");
        quietShelter.dequeue("cat");
        assertEquals("dogdog", "dog -> dog -> Back", quietShelter.toString());
    }

    @Test
    public void testGivingDog() {
        NodeGenericQueue quietShelter = new NodeGenericQueue();
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");

        assertEquals("catdogcatdog", "cat -> dog -> cat -> dog -> Back", quietShelter.toString());

        quietShelter.dequeue("dog");
        quietShelter.dequeue("dog");
        assertEquals("catcat", "cat -> cat -> Back", quietShelter.toString());
    }

    @Test
    public void testGivingAll() {
        NodeGenericQueue quietShelter = new NodeGenericQueue();
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");

        quietShelter.dequeue("dog");
        quietShelter.dequeue("dog");

        quietShelter.dequeue("cat");
        quietShelter.dequeue("cat");

        assertEquals("nothing here.", "NULL", quietShelter.toString());
    }

    @Test
    public void noPrefTest() {
        NodeGenericQueue quietShelter = new NodeGenericQueue();
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");
        assertEquals("no pref? you get last, cat!", "cat", quietShelter.dequeue());
        assertEquals("no pref? you get last, dog!", "dog", quietShelter.dequeue());
        assertEquals("no pref? you get last, dog!", "we don't have any animals for you!", quietShelter.dequeue());
    }
}