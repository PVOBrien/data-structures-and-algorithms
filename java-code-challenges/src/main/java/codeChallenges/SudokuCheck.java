package codeChallenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SudokuCheck { // https://www.codewars.com/kata/529bf0e9bdf7657179000008/train/java

    public static boolean check(int[][] sudoku) {

        List<HashSet<Integer>> vertSud = new ArrayList<>();
        List<HashSet<Integer>> sudGrid = new ArrayList<>();

        for (int g = 0; g < 9; g++) {
            sudGrid.add(new HashSet<>());
        }

        for (int v = 0; v < 9; v++) { // https://stackoverflow.com/questions/14483236/make-multiple-hashsets-using-a-loop-java
            vertSud.add(new HashSet<>());
        }

        for (int i = 0; i < sudoku.length; i++) { // working through the horizontal sdk line.
            int[] thisSud = sudoku[i]; // this is the row being worked over
            HashSet<Integer> horiSud = new HashSet<>(); // this is where the row's values will be checked. Reset each line.
            for (int j = 0; j < thisSud.length; j++) { // now working over each value of the row.
                int thisSpecificNumber = thisSud[j];
                int firstGridLtr = SudokuCheck.gridLtrHelper(i);
                int secondGridLtr = SudokuCheck.gridLtrHelper(j);
                String gridLtr = String.format("%d%d", firstGridLtr, secondGridLtr);
                switch (Integer.parseInt(gridLtr)) {
                    case 00 : {
                        if (sudGrid.get(0).contains(thisSud[j])) return false;
                        sudGrid.get(0).add(thisSud[j]);
                        break;
                    }
                    case 01 : {
                        if (sudGrid.get(1).contains(thisSud[j])) return false;
                        sudGrid.get(1).add(thisSud[j]);
                        break;
                    }
                    case 02 : {
                        if (sudGrid.get(2).contains(thisSud[j])) return false;
                        sudGrid.get(2).add(thisSud[j]);
                        break;
                    }

                    case 10 : {
                        if (sudGrid.get(3).contains(thisSud[j])) return false;
                        sudGrid.get(3).add(thisSud[j]);
                        break;
                    }
                    case 11 : {
                        if (sudGrid.get(4).contains(thisSud[j])) return false;
                        sudGrid.get(4).add(thisSud[j]);
                        break;
                    }
                    case 12 : {
                        if (sudGrid.get(5).contains(thisSud[j])) return false;
                        sudGrid.get(5).add(thisSud[j]);
                        break;
                    }

                    case 20 : {
                        if (sudGrid.get(6).contains(thisSud[j])) return false;
                        sudGrid.get(6).add(thisSud[j]);
                        break;
                    }
                    case 21 : {
                        if (sudGrid.get(7).contains(thisSud[j])) return false;
                        sudGrid.get(7).add(thisSud[j]);
                        break;
                    }
                    case 22 : {
                        if (sudGrid.get(8).contains(thisSud[j])) return false;
                        sudGrid.get(8).add(thisSud[j]);
                        break;
                    }

                }
                if (horiSud.contains(thisSpecificNumber) || horiSud.contains(0) || vertSud.get(j).contains(thisSpecificNumber) || vertSud.get(j).contains(0)) { // if the row contains the value already in the row OR column...
                    return false; // ... it's a bad sdk.
                } else {
                    horiSud.add(thisSpecificNumber); // put the value into the set for future checks
                    vertSud.get(j).add(thisSpecificNumber); // put the value into the set for future checks
                }
            }
        }
//        System.out.println(sudGrid.get(4).toString());
        return true; // if it makes it all the way down, it's good to go.
    }

    private static int gridLtrHelper(int figureThis) {
        if (figureThis < 3) return 0;
        if (figureThis > 2 && figureThis < 6) return  1;
        if (figureThis > 5) return  2;
        return -1;
    }

}
