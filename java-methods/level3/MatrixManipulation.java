package level3;

import java.util.*;

public class MatrixManipulation {
    public static void main(String[] args) {
        Random rand = new Random();

        int rows = 3;
        int cols = 3;

        double[][] mat1 = createRandomMatrix(rows, cols, rand);
        double[][] mat2 = createRandomMatrix(rows, cols, rand);

        System.out.println("Matrix 1:");
        displayMatrix(mat1);
        System.out.println("\nMatrix 2:");
        displayMatrix(mat2);

        System.out.println("\nAddition:");
        displayMatrix(addMatrices(mat1, mat2));

        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(mat1, mat2));

        System.out.println("\nMultiplication:");
        displayMatrix(multiplyMatrices(mat1, mat2));
    }

    public static double[][] createRandomMatrix(int rows, int cols, Random rand) {
        double[][] mat = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10) + 1; // random 1-10
        return mat;
    }

    public static double[][] addMatrices(double[][] mat1, double[][] mat2) {
        int rows = mat1.length, cols = mat1[0].length;
        double[][] sum = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum[i][j] = mat1[i][j] + mat2[i][j];
        return sum;
    }

    public static double[][] subtractMatrices(double[][] mat1, double[][] mat2) {
        int rows = mat1.length, cols = mat1[0].length;
        double[][] diff = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                diff[i][j] = mat1[i][j] - mat2[i][j];
        return diff;
    }

    public static double[][] multiplyMatrices(double[][] mat1, double[][] mat2) {
        int rows1 = mat1.length, cols1 = mat1[0].length;
        int rows2 = mat2.length, cols2 = mat2[0].length;
        if (cols1 != rows2) throw new IllegalArgumentException("Cannot multiply matrices: incompatible dimensions");
        double[][] product = new double[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return product;
    }

    public static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.printf("%5.1f ", val);
            System.out.println();
        }
    }
}

