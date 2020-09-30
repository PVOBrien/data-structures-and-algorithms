package utilities;

import org.junit.Test;

public class AnimalShelterTest {

    @Test
    public void testEmptyAnimalShelter(){
        NodeGenericQueue quietShelter = new NodeGenericQueue();
        System.out.println(quietShelter.toString());
    }

    @Test
    public void testFillingAnimalShelter(){
        NodeGenericQueue quietShelter = new NodeGenericQueue();
        quietShelter.enqueue("cat");
        quietShelter.enqueue("cat");
        quietShelter.dequeue("cat");
        quietShelter.dequeue("cat");

//        quietShelter.enqueue("dog");
//        quietShelter.enqueue("dog");
//        quietShelter.enqueue("dog");
//        quietShelter.enqueue("cat");
//
        System.out.println(quietShelter.toString());
//
//        quietShelter.dequeue("dog");
//        quietShelter.dequeue("dog");
//        quietShelter.dequeue("dog");
//
//        System.out.println(quietShelter.toString());
//
//        quietShelter.dequeue("cat");
//        quietShelter.dequeue("cat");
//
//        System.out.println(quietShelter.toString());

    }

//    @Test
//    public void testHappyHomesForAnimalShelter(){
//        NodeGenericQueue quietShelter = new NodeGenericQueue();
//        quietShelter.enqueue("cat");
//        quietShelter.enqueue("dog");
//        quietShelter.enqueue("cat");
//        quietShelter.enqueue("dog");
//        quietShelter.enqueue("cat");
//        quietShelter.enqueue("dog");
//        System.out.println(quietShelter);
//    }
}
