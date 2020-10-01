package utilities;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiBracketValidationTest {

//    @Test // Passed to assert Regex functions.
//    public void testRegexTrue() {
//
//        assertTrue(MultiBracketValidation.testForMirrors("{"));
//        assertTrue(MultiBracketValidation.testForMirrors("["));
//        assertTrue(MultiBracketValidation.testForMirrors("("));
//    }

//    @Test // Passed to assert Regex functions.
//    public void testRegexFalse() {
//        assertFalse(MultiBracketValidation.testForMirrors("1"));
//        assertFalse(MultiBracketValidation.testForMirrors("b"));
//        assertFalse(MultiBracketValidation.testForMirrors("?"));
//    }

    @Test
    public void removeCurlyBrackets() {
        assertFalse(MultiBracketValidation.testForMirrors("}"));
        assertTrue(MultiBracketValidation.testForMirrors("{a}"));
//        assertTrue(MultiBracketValidation.testForMirrors("{{}}"));
//        assertTrue(MultiBracketValidation.testForMirrors("{}{{}}"));
//        assertTrue(MultiBracketValidation.testForMirrors("a}{}{{}}"));
//        assertFalse(MultiBracketValidation.testForMirrors("}{}){{}}"));

//        assertFalse(MultiBracketValidation.testForMirrors("{{}(}"));
    }


}