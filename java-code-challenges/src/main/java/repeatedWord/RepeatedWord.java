package repeatedWord;

import java.util.Hashtable;

public class RepeatedWord {

    public String getFirstRepeated(String words) throws Exception {

        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        String firstRepeated = "";

        words = words.replaceAll("\\p{Punct}", "").toLowerCase(); // https://www.geeksforgeeks.org/removing-punctuations-given-string/
        String [] arrayOfWords = words.split("\\s");

        if(arrayOfWords.length < 2) {
            throw new Exception("You can't just compare one thing. Try Again.");
        }

        for (int i = 0; i < arrayOfWords.length; i++) {
            if (hashtable.contains(arrayOfWords[i])) {
                return arrayOfWords[i];
            } else {
                hashtable.put(arrayOfWords[i], arrayOfWords[i]);
            }
        }
        return "not here";
    }

}
