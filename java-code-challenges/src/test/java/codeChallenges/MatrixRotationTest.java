package codeChallenges;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class MatrixRotationTest {

    int[][] matrix = new int[3][3];

    @Before
    public void matrixCreate(){
        matrix[0] = new int[]{1, 2, 3};
        matrix[1] = new int[]{4, 5, 6};
        matrix[2] = new int[]{7, 8, 9};
    }

    @Test
    public void matrixCounterClockwiseRotateTest() {
        MatrixRotation matrixR = new MatrixRotation();
        int[][] results = matrixR.matrixCounterClockwiseRotate(matrix);
        System.out.println(Arrays.toString(results[0]));
        System.out.println(Arrays.toString(results[1]));
        System.out.println(Arrays.toString(results[2]));
    }

    @Test
    public void matrixOneEightyTest() {
        MatrixRotation matrixR = new MatrixRotation();
        int[][] results = matrixR.matrixOneEighty(matrix);
        System.out.println(Arrays.toString(results[0]));
        System.out.println(Arrays.toString(results[1]));
        System.out.println(Arrays.toString(results[2]));
    }

    @Test
    public void matrixFlipTest() {
        MatrixRotation matrixR = new MatrixRotation();
        int[][] results = matrixR.matrixFlip(matrix);
        System.out.println(Arrays.toString(results[0]));
        System.out.println(Arrays.toString(results[1]));
        System.out.println(Arrays.toString(results[2]));
    }

    @Test
    public void matrixSomeTwistTest() {
        MatrixRotation matrixR = new MatrixRotation();
        int[][] results = matrixR.matrixSomeTwist(matrix);
        System.out.println(Arrays.toString(results[0]));
        System.out.println(Arrays.toString(results[1]));
        System.out.println(Arrays.toString(results[2]));
    }

    @Test
    public void matrixClockwiseRotateTest() {
        MatrixRotation matrixR = new MatrixRotation();
        int[][] results = matrixR.matrixClockwiseRotate(matrix);
        System.out.println(Arrays.toString(results[0]));
        System.out.println(Arrays.toString(results[1]));
        System.out.println(Arrays.toString(results[2]));
    }
}
