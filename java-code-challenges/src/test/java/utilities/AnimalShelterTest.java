package utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalShelterTest {

    @Test
    public void testEmptyAnimalShelter() {
        AnimalShelter quietShelter = new AnimalShelter();
        System.out.println(quietShelter.toString());
    }

    @Test
    public void testFillingAnimalShelter() {
        AnimalShelter quietShelter = new AnimalShelter();
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");
        assertEquals("catdogcatdog", "cat -> dog -> cat -> dog -> Back", quietShelter.toString());
    }

    @Test
    public void testGivingCats() {
        AnimalShelter quietShelter = new AnimalShelter();
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
        AnimalShelter quietShelter = new AnimalShelter();
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
        AnimalShelter quietShelter = new AnimalShelter();
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
        AnimalShelter quietShelter = new AnimalShelter();
        quietShelter.enqueue("cat");
        quietShelter.enqueue("dog");
        assertEquals("no pref? you get last, cat!", "cat", quietShelter.dequeue());
        assertEquals("no pref? you get last, dog!", "dog", quietShelter.dequeue());
        assertEquals("no pref? you get last, dog!", "we don't have any animals for you!", quietShelter.dequeue());
    }
}