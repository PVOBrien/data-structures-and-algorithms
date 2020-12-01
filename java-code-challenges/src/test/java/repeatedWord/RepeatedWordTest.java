package repeatedWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedWordTest {

    @Test
    public void noRepeatedWordTestOne() throws Exception {

    RepeatedWord repeatedWord = new RepeatedWord();

    String testStringOne = "This is a test. It will fail.";
    String getTestStringOneResult = repeatedWord.getFirstRepeated(testStringOne);
    assertEquals("Nothing to return", "not here", getTestStringOneResult);
    }

    @Test
    public void yesRepeatedWordTest() throws Exception {
        RepeatedWord repeatedWord = new RepeatedWord();
        String test2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        assertEquals("It shall be it. We caught the capital vs not-capital", "it", repeatedWord.getFirstRepeated(test2));
    }

    @Test
    public void yesRepeatedWordTwoTest() throws Exception {
        RepeatedWord repeatedWord = new RepeatedWord();
        String test3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assertEquals("summer.", "summer", repeatedWord.getFirstRepeated(test3));
    }
}
