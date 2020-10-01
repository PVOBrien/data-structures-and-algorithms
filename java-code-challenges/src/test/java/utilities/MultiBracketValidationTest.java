package utilities;

import org.junit.Test;

import static org.junit.Assert.*;

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
        assertTrue(MultiBracketValidation.testForMirrors("{}"));
        assertTrue(MultiBracketValidation.testForMirrors("{}(){}"));
        assertTrue(MultiBracketValidation.testForMirrors("()[[Extra Characters]]"));
        assertTrue(MultiBracketValidation.testForMirrors("(){}[[]]"));
        assertTrue(MultiBracketValidation.testForMirrors("{}{Code}[Fellows](())"));
        assertFalse(MultiBracketValidation.testForMirrors("[({}]"));
        assertFalse(MultiBracketValidation.testForMirrors("(]("));
        assertFalse(MultiBracketValidation.testForMirrors("{(})"));
    }


}