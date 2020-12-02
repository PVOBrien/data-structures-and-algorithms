package codeChallenges;

public class MatrixRotation {

    // Todo: all 2s should be arraytoRotate.length-1 (to account for offby1)
    public int[][] matrixCounterClockwiseRotate(int[][] arrayToRotate) {
        int[][] rotatedMatrix = new int[arrayToRotate.length][arrayToRotate[1].length];

        for (int i = 0; i < arrayToRotate.length; i++) {
            int[] tempMatrix = arrayToRotate[i];
            for (int j = 0; j < arrayToRotate.length; j++) {
                rotatedMatrix[2-j][2-i] = tempMatrix[j];
            }
        }
        return rotatedMatrix;
    }

    public int[][] matrixOneEighty(int[][] arrayToRotate) {
        int[][] rotatedMatrix = new int[arrayToRotate.length][arrayToRotate[1].length];

        for (int i = 0; i < arrayToRotate.length; i++) {
            int[] tempMatrix = arrayToRotate[i];
            for (int j = 0; j < arrayToRotate.length; j++) {
                rotatedMatrix[2-i][2-j] = tempMatrix[j];
            }
        }
        return rotatedMatrix;
    }

    public int[][] matrixFlip(int[][] arrayToRotate) {
        int[][] rotatedMatrix = new int[arrayToRotate.length][arrayToRotate[1].length];

        for (int i = 0; i < arrayToRotate.length; i++) {
            int[] tempMatrix = arrayToRotate[i];
            for (int j = 0; j < arrayToRotate.length; j++) { // Holy cow, there is a built-in array rotater!
                rotatedMatrix[2-i][j] = tempMatrix[j];
            }
        }
        return rotatedMatrix;
    }

    public int[][] matrixSomeTwist(int[][] arrayToRotate) {
        int[][] rotatedMatrix = new int[arrayToRotate.length][arrayToRotate[1].length];

        for (int i = 0; i < arrayToRotate.length; i++) {
            int[] tempMatrix = arrayToRotate[i];
            for (int j = 0; j < arrayToRotate.length; j++) {
                rotatedMatrix[j][2-i] = tempMatrix[j];
            }
        }
        return rotatedMatrix;
    }

    public int[][] matrixClockwiseRotate(int[][] arrayToRotate) {
        int[][] rotatedMatrix = new int[arrayToRotate.length][arrayToRotate[1].length];

        for (int i = 0; i < arrayToRotate.length; i++) {
            int[] tempMatrix = arrayToRotate[i];
            for (int j = 0; j < arrayToRotate.length; j++) {
                rotatedMatrix[j][2-i] = tempMatrix[j];
            }
        }
        return rotatedMatrix;
    }

}
