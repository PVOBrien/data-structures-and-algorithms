package utilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Swap them strings")
public class StringSwapperTest {

    String firstString = "hello world!";

    @Test
    public void StringTestOne() {
        assertEquals("!dlrow olleh", StringSwapper.swapperBackToFront(firstString));
    }

    @Test
    public void StringInPlaceTest() {
        assertEquals("!dlrow olleh", StringSwapper.swapperBackToFrontInPlace(firstString));
    }

    @Test
    public void StringInPlaceTestTwo() {
        System.out.println(StringSwapper.swapperBackToFrontInPlaceCharArray(firstString));
        char[] revCharArray = "!dlrow olleh".toCharArray();
        assertEquals(Arrays.toString(revCharArray), Arrays.toString(StringSwapper.swapperBackToFrontInPlaceCharArray(firstString)));
    }

}
