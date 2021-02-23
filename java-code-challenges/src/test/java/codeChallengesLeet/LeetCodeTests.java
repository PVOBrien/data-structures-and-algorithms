package codeChallengesLeet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("For the Leets!")
public class LeetCodeTests {

    @Nested
    @DisplayName("ZigZag.")
    class zigZagTesting {

        @Test
        @DisplayName("The zig and zagging")
        public void zigTestOne(){
            assertEquals("acbd", ZigZag.zigZagger("abcd", 2));
            assertEquals("pciahku", ZigZag.zigZagger("pikachu", 3));
        }
    }
}
