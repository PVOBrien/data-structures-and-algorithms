package leftJoin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftJoinTest {

    HashMap<String, String> synonymHash = new HashMap<>();
    HashMap<String, String> antonymHash = new HashMap<>();

    @BeforeEach
    public void hashMapCreate(){

        synonymHash.put("fond", "enamored");
        synonymHash.put("wrath", "angered");
        synonymHash.put("diligent", "employed");
        synonymHash.put("outfit", "garb");
        synonymHash.put("guide", "usher");

        antonymHash.put("fond", "averse");
        antonymHash.put("wrath", "delight");
        antonymHash.put("diligent", "idle");
        antonymHash.put("guide", "follow");
        antonymHash.put("flow", "jam");

    }

    @Test
    public void hashMapTest(){
        assertEquals("this is the synonyms.", "{diligent=employed, outfit=garb, wrath=angered, guide=usher, fond=enamored}", synonymHash.toString());
        assertEquals("this is the antonyms.", "{diligent=idle, wrath=delight, guide=follow, flow=jam, fond=averse}", antonymHash.toString());
    }

    @Test
    public void hashMapKeysListTest(){
        Set<String> synonymArrayList = synonymHash.keySet();
        assertEquals("These are the keys of the synonymList.", "[diligent, outfit, wrath, guide, fond]", synonymArrayList.toString());
    }

    @Test
    public void joinLeftTest(){
        LeftJoin leftJoinClass = new LeftJoin();
        String[][] results = leftJoinClass.leftJoin(synonymHash, antonymHash);
        assertEquals("this is the zero-th index", "[diligent, employed, idle]", Arrays.toString(results[0]));
        assertEquals("this is the first index", "[outfit, garb, null]", Arrays.toString(results[1]));
        assertEquals("this is the 2nd index", "[wrath, angered, delight]", Arrays.toString(results[2]));
        assertEquals("this is the 3rd index", "[guide, usher, follow]", Arrays.toString(results[3]));
        assertEquals("this is the 4th index", "[fond, enamored, averse]", Arrays.toString(results[4]));
    }

    @Test
    public void joinUnequalHashTest(){
        HashMap<String, String> smallerHash = new HashMap<>();
        HashMap<String, String> largerHash = new HashMap<>();

        smallerHash.put("fond", "enamored");
        smallerHash.put("wrath", "angered");
        smallerHash.put("diligent", "employed");

        largerHash.put("fond", "averse");
        largerHash.put("wrath", "delight");
        largerHash.put("diligent", "idle");
        largerHash.put("guide", "follow");
        largerHash.put("flow", "jam");

        LeftJoin leftJoinClass = new LeftJoin();
        leftJoinClass.leftJoin(smallerHash, largerHash);
        assertEquals("returns all values joined from left", "[ [diligent, employed, idle] [wrath, angered, delight] [fond, enamored, averse] ]",leftJoinClass.toString());
    }

    @Test
    public void joinEmptyHashTest() {
        HashMap<String, String> smallerHash = new HashMap<>();
        HashMap<String, String> largerHash = new HashMap<>();

        LeftJoin leftJoinClass = new LeftJoin();
        leftJoinClass.leftJoin(smallerHash, largerHash).toString();
        assertEquals("nothing to show here, hashmap nonexistent.", "[ ]", leftJoinClass.toString());
    }
}
