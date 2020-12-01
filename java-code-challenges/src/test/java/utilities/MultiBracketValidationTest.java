package utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiBracketValidationTest {

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