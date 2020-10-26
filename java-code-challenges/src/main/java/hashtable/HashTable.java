package hashtable;


import java.util.ArrayList;
import java.util.NoSuchElementException;

public class HashTable {

    ArrayList<ArrayList<HtNode>> theHashTable;

    public HashTable(){
        this.theHashTable = new ArrayList<>(10); // this is "ineffective". Or is it really just saying you can go up to 10, but it's not building anything into it? *really?* *StrongSideEyes*
    }

    public HashTable(int size) { // I thought this would solve the need for an empty hashtable like on line 10?
        this.theHashTable = new ArrayList<>(size);
    }

    public void add(String key, int value) {
        int hashedIndex = hash(key);
        HtNode nodeToAdd = new HtNode();
        nodeToAdd.setKey(key);
        nodeToAdd.setValue(value);
        theHashTable.get(hashedIndex).add(nodeToAdd);
    }

    public boolean contains (String key) {
        int hashedIndex = hash(key);
        ArrayList<HtNode> bucketInQuestion = theHashTable.get(hashedIndex);
        try {
            for (int i = 0; i < bucketInQuestion.size(); i++) {
                if (key.equals(bucketInQuestion.get(i).getKey())) {
                    return true;
                }
            }
        } catch (NullPointerException npe) {
//          npe.printStackTrace();
            System.out.println("The key does not exist here.");
        } finally {
        return false;
        }
    }


    public int get (String key) {
        int hashedIndex = hash(key);
        if (contains(key) == true) {
            ArrayList<HtNode> bucketInQuestion = theHashTable.get(hashedIndex);
            for (int i = 0; i < bucketInQuestion.size(); i++) {
                if (key == bucketInQuestion.get(i).getKey()) {
                    int valueToReturn = bucketInQuestion.get(i).getValue();
                    return valueToReturn;
                }
            }
        }
        throw new NoSuchElementException("can't happen");
    }

    private int hash(String key) {
        int hash = 0;
        int sizeOfBucket = theHashTable.size(); // make it *crazy* dynamic

        for (int i = 0; i < key.length(); i++) {
            hash += Character.getNumericValue(key.charAt(i)); // https://www.javatpoint.com/java-char-to-int#:~:text=We%20can%20convert%20char%20to%20int%20in%20java,method.%20Alternatively%2C%20we%20can%20use%20String.valueOf%20%28char%29%20method.
        }

        hash = hash^3;
        hash = hash * sizeOfBucket;
        hash = hash / (sizeOfBucket * 3);
        hash = hash % sizeOfBucket;
        hash = (int) Math.floor(hash);
        return hash;

    }

    public String toString(ArrayList<ArrayList<HtNode>> thingToString){

        String string = "[\n";

        for (int i = 0; i < thingToString.size(); i++) {
            string += i + ": [";
            ArrayList<HtNode> nextStep = thingToString.get(i); // making it human readable.
            for (int j = 0; j < nextStep.size(); j++) {
                string += "{" + nextStep.get(j).getKey() + ", " + nextStep.get(j).getValue() + "},";
            }
            string += "] \n";
        }
        string += "]";

        return string;
    }
}