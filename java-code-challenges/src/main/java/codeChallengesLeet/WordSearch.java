package codeChallengesLeet;

import java.util.*;

public class WordSearch { // https://leetcode.com/problems/word-search/description/
    public boolean exist(char[][] board, String word) {
        HashMap<Character, Boolean> charHM = new HashMap<>();
        word.chars().forEach(letter -> charHM.put((char) letter, false));

        for (char[] chars : board) {
            for (char aChar : chars) {
//                CharSequence letter = String.valueOf(board[i][j]); // https://stackoverflow.com/questions/56056419/how-can-i-convert-a-char-to-charsequence
                if (charHM.containsKey(aChar))
                    charHM.replace(aChar, true); // https://www.programiz.com/java-programming/library/hashmap/replace#:~:text=%20Java%20HashMap%20replace%20%28%29%20%201%20replace,hashmap%20named%20languages.%20Here%2C%20we%20have...%20More%20
            }
        }

        for (Map.Entry<Character, Boolean> charEntry : charHM.entrySet()) { // https://stackabuse.com/guide-to-java-streams-foreach-with-examples/
            System.out.println("Key: " + charEntry.getKey() + " Value: " + charEntry.getValue());
            if (!charEntry.getValue()) return false;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (recWordSearch(i, j, "", board, word, new HashSet<>())) return true;
                } else {
                    System.out.println();
                }
            }
        }
        return false;
    }

    private static boolean recWordSearch(int outArr, int inArr,
                                         String wCSoFar,
                                         char[][] wordBoard, String word,
                                         HashSet<ArrayList<Integer>> path) {
        ArrayList<Integer> up = new ArrayList<>(Arrays.asList(outArr - 1, inArr));
        ArrayList<Integer> right = new ArrayList<>(Arrays.asList(outArr, inArr + 1));
        ArrayList<Integer> down = new ArrayList<>(Arrays.asList(outArr + 1, inArr));
        ArrayList<Integer> left = new ArrayList<>(Arrays.asList(outArr, inArr - 1));
        boolean foundWord = false;

        wCSoFar += (wordBoard[outArr][inArr]);
        ArrayList<Integer> pathArr = new ArrayList<>();
        pathArr.add(outArr);
        pathArr.add(inArr);

        if (wCSoFar.equals(word)) {
            return true;
        }

        if (up.get(0) != -1 && !path.contains(up) && wordBoard[outArr - 1][inArr] == word.charAt(wCSoFar.length())) {
            path.add(pathArr);
            foundWord = recWordSearch(outArr - 1, inArr, wCSoFar, wordBoard, word, path); // base case
            path.remove(pathArr);
        }

        if (right.get(1) < wordBoard[outArr].length && !foundWord && !path.contains(right) && wordBoard[outArr][inArr + 1] == word.charAt(wCSoFar.length())) {
            path.add(pathArr);
            foundWord = recWordSearch(outArr, inArr + 1, wCSoFar, wordBoard, word, path);
            path.remove(pathArr);
        }

        if (down.get(0) < wordBoard.length && !foundWord && wordBoard[outArr + 1][inArr] == word.charAt(wCSoFar.length()) && !path.contains(down)) {
            path.add(pathArr);
            foundWord = recWordSearch(outArr + 1, inArr, wCSoFar, wordBoard, word, path); // base case
            path.remove(pathArr);
        }

        if (left.get(1) != -1 && !foundWord && !path.contains(left) && wordBoard[outArr][inArr - 1] == word.charAt(wCSoFar.length())) {
            path.add(pathArr);
            foundWord = recWordSearch(outArr, inArr - 1, wCSoFar, wordBoard, word, path); // base case
            path.remove(pathArr);
        }
        return foundWord;
    }
}
